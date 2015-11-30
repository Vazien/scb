package com.corryn.scb.business.domain;

import com.corryn.scb.exchange.model.LeagueDTO;
import com.corryn.scb.exchange.model.LeagueResultDTO;
import com.corryn.scb.exchange.model.ScheduleDTO;
import java.util.List;
import javax.ejb.Local;

@Local
public abstract interface LeagueManager
{
  public abstract List<String> getYears(String paramString);
  
  public abstract LeagueDTO getLeague(String paramString1, String paramString2);
  
  public abstract LeagueDTO saveLeague(LeagueDTO paramLeagueDTO);
  
  public abstract List<LeagueDTO> getLeagues(String paramString);
  
  public abstract LeagueResultDTO getLeagueResult(Long paramLong);
  
  public abstract void saveSchedule(ScheduleDTO paramScheduleDTO);
}


/* Location:              C:\Users\gh29142\Desktop\SCBCore-0.0.1.jar!\com\corryn\scb\business\domain\LeagueManager.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */