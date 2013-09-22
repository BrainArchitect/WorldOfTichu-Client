package commands.customGame;

import gui.LobbyWindow;
import commands.Command;

public class FetchCustomTables extends Command {

	@Override
	public void execute(String... params) {
		LobbyWindow.callMethod("fetchCustomTables", params);
	}
}
