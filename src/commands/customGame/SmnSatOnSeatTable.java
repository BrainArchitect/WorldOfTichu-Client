package commands.customGame;

import gui.LobbyWindow;
import commands.Command;

public class SmnSatOnSeatTable extends Command {

	@Override
	public void execute(String... params) {
		LobbyWindow.callMethod("smnSatOnSeatTable", params);

	}

}
