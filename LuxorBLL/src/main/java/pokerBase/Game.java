package pokerBase;

import java.util.ArrayList;
import java.util.UUID;

public class Game {
	private UUID GameID;
	private ArrayList<Player> GamePlayers;
	public Game() {
		super();
	}
	public UUID getGameID() {
		return GameID;
	}
	public void setGameID(UUID gameID) {
		GameID = gameID;
	}
	public ArrayList<Player> getGamePlayers() {
		return GamePlayers;
	}
	public void setGamePlayers(ArrayList<Player> gamePlayers) {
		GamePlayers = gamePlayers;
	}
	
	public void AddPlayerToGame(Player Table, Player Player){
		GamePlayers.add(Table);
		GamePlayers.add(Player);
	}

}
