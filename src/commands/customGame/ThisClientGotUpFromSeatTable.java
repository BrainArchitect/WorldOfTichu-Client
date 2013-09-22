package commands.customGame;

import gui.LobbyWindow;
import commands.Command;

public class ThisClientGotUpFromSeatTable extends Command {

	@Override
	public void execute(String... params) {
		LobbyWindow.callMethod("thisClientGotUpFromSeatTable", params);

	}

}
