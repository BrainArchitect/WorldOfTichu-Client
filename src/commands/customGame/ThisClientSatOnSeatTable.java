package commands.customGame;

import gui.LobbyWindow;
import commands.Command;

public class ThisClientSatOnSeatTable extends Command {

	@Override
	public void execute(String... params) {
		LobbyWindow.callMethod("thisClientSatOnSeatTable", params);

	}

}
