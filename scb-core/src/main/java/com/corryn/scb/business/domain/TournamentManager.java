package com.corryn.scb.business.domain;

import com.corryn.scb.exchange.model.TournamentDTO;
import java.util.List;
import javax.ejb.Local;

@Local
public abstract interface TournamentManager
{
  public abstract List<TournamentDTO> getOpenTournaments();
  
  public abstract List<TournamentDTO> getClosedTournaments();
  
  public abstract TournamentDTO saveTournament(TournamentDTO paramTournamentDTO);
  
  public abstract void deleteTournament(TournamentDTO paramTournamentDTO);
}


/* Location:              C:\Users\gh29142\Desktop\SCBCore-0.0.1.jar!\com\corryn\scb\business\domain\TournamentManager.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */