package pokerBase;

import java.util.ArrayList;
import java.util.UUID;

public class Table {
	private UUID TableID;
	private ArrayList<Player> TablePlayers;
	public Table() {
		super();
	}
	public UUID getTableID() {
		return TableID;
	}
	public void setTableID(UUID tableID) {
		TableID = tableID;
	}
	public ArrayList<Player> getTablePlayers() {
		return TablePlayers;
	}
	public void setTablePlayers(ArrayList<Player> tablePlayers) {
		TablePlayers = tablePlayers;
	}
	
	

}
