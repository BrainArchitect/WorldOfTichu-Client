package commands.customGame;

import gui.LobbyWindow;
import commands.Command;

public class ThisClientJoinedTable extends Command {

	@Override
	public void execute(String... params) {
		LobbyWindow.callMethod("thisClientJoinedTable", params);
	}

}
