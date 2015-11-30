package com.corryn.scb.business.domain;

import com.corryn.scb.business.model.CompareAbleTeamResult;
import com.corryn.scb.data.converter.LeagueEntityDTOConverter;
import com.corryn.scb.data.converter.TeamEntityDTOConverter;
import com.corryn.scb.data.dao.domain.LeagueDAO;
import com.corryn.scb.data.dao.domain.ScheduleDAO;
import com.corryn.scb.data.persistence.model.LeagueEntity;
import com.corryn.scb.data.persistence.model.ScheduleEntity;
import com.corryn.scb.data.persistence.model.ScheduleResultEntity;
import com.corryn.scb.data.persistence.model.TeamEntity;
import com.corryn.scb.exchange.model.LeagueDTO;
import com.corryn.scb.exchange.model.LeagueResultDTO;
import com.corryn.scb.exchange.model.ScheduleDTO;
import com.corryn.scb.exchange.model.ScheduleResultDTO;
import com.corryn.scb.exchange.model.TeamResultDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.inject.Inject;

@Stateless
@TransactionManagement(TransactionManagementType.CONTAINER)
@TransactionAttribute(TransactionAttributeType.REQUIRED)
public class LeagueManagerImpl
  implements LeagueManager
{
  @Inject
  private LeagueDAO leagueDAO;
  @Inject
  private ScheduleDAO scheduleDAO;

  public List<String> getYears(String leagueType)
  {
    return this.leagueDAO.getYearsForType(leagueType);
  }

  public LeagueDTO getLeague(String leagueType, String year)
  {
    LeagueEntity entity = this.leagueDAO.getLeagueForTypeAndYear(leagueType, year);
    return new LeagueEntityDTOConverter().toDTO(entity);
  }

  public LeagueDTO saveLeague(LeagueDTO league)
  {
    LeagueEntityDTOConverter converter = new LeagueEntityDTOConverter();
    LeagueEntity entity = converter.toEntity(league);
    return converter.toDTO(entity);
  }

  public List<LeagueDTO> getLeagues(String leagueType)
  {
    List<LeagueEntity> entities = this.leagueDAO.getLeagueForType(leagueType);
    List<LeagueDTO> leagues = new ArrayList<LeagueDTO>();
    LeagueEntityDTOConverter converter = new LeagueEntityDTOConverter();
    for (LeagueEntity entity : entities) {
      leagues.add(converter.toDTO(entity));
    }
    return leagues;
  }

  public LeagueResultDTO getLeagueResult(Long leagueId)
  {
    LeagueEntity league = (LeagueEntity)this.leagueDAO.findEntityByAttribute("id", leagueId);

    LeagueResultDTO leagueResultDTO = new LeagueResultDTO();

    Map<Long, CompareAbleTeamResult> compareAbleTeamResultList = new HashMap();
    for (TeamEntity team : league.getTeams())
    {
      CompareAbleTeamResult compareAbleTeamResult = new CompareAbleTeamResult();
      compareAbleTeamResult.setTeam(team);
      compareAbleTeamResultList.put(team.getId(), compareAbleTeamResult);
    }
    ScheduleEntity schedule;
    for (Iterator i$ = league.getSchedule().iterator(); i$.hasNext();)
    {
      schedule = (ScheduleEntity)i$.next();
      for (ScheduleResultEntity scheduleResult : schedule.getResult())
      {
        CompareAbleTeamResult compareAbleTeamResult = (CompareAbleTeamResult)compareAbleTeamResultList.get(scheduleResult.getTeam().getId());
        if (schedule.getIndex().intValue() == league.getSchedule().size()) {
          compareAbleTeamResult.setLastSchedule(scheduleResult.getPoints());
        } else {
          compareAbleTeamResult.setPreviousSchedules(Integer.valueOf(compareAbleTeamResult.getPreviousSchedules().intValue() + scheduleResult.getPoints().intValue()));
        }
      }
    }
    List<CompareAbleTeamResult> compareResult = new ArrayList<CompareAbleTeamResult>();
    Iterator<Map.Entry<Long, CompareAbleTeamResult>> iterator = compareAbleTeamResultList.entrySet().iterator();
    while (iterator.hasNext())
    {
      CompareAbleTeamResult compareAbleTeamResult = (CompareAbleTeamResult)((Map.Entry)iterator.next()).getValue();
      compareAbleTeamResult.setSummary(Integer.valueOf(compareAbleTeamResult.getLastSchedule().intValue() + compareAbleTeamResult.getPreviousSchedules().intValue()));
      compareResult.add(compareAbleTeamResult);
    }
    Collections.sort(compareResult);

    Integer rank = Integer.valueOf(1);
    TeamEntityDTOConverter converter = new TeamEntityDTOConverter();
    for (Iterator<CompareAbleTeamResult> i$ = compareResult.iterator(); i$.hasNext(); rank = Integer.valueOf(rank.intValue() + 1))
    {
      CompareAbleTeamResult result = (CompareAbleTeamResult)i$.next();

      TeamResultDTO teamResultDTO = new TeamResultDTO();
      teamResultDTO.setRanking(rank);
      teamResultDTO.setTeam(converter.toDTO(result.getTeam()));
      teamResultDTO.setPreviousSchedules(result.getPreviousSchedules());
      teamResultDTO.setLastSchedule(result.getLastSchedule());
      teamResultDTO.setSummary(result.getSummary());

      leagueResultDTO.getResult().add(teamResultDTO);
    }
    return leagueResultDTO;
  }

  public void saveSchedule(ScheduleDTO dto)
  {
    ScheduleEntity entity = (ScheduleEntity)this.scheduleDAO.findEntityByAttribute("id", dto.getId());
    ScheduleResultDTO scheduleResultDTO;
    for (Iterator i$ = dto.getResult().iterator(); i$.hasNext();)
    {
      scheduleResultDTO = (ScheduleResultDTO)i$.next();
      for (ScheduleResultEntity scheduleResultEntity : entity.getResult()) {
        if (scheduleResultEntity.getId() == scheduleResultDTO.getId())
        {
          scheduleResultEntity.setPoints(scheduleResultDTO.getPoints());
          break;
        }
      }
    }
    this.scheduleDAO.persist(entity);
  }
}
