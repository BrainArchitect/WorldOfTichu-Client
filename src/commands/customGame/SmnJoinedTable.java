package commands.customGame;

import gui.LobbyWindow;
import commands.Command;

public class SmnJoinedTable extends Command {

	@Override
	public void execute(String... params) {
		LobbyWindow.callMethod("smnJoinedTable", params);
	}

}
