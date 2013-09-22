package commands.customGame;

import gui.LobbyWindow;
import commands.Command;

public class SmnGotUpFromSeatTable extends Command {

	@Override
	public void execute(String... params) {
		LobbyWindow.callMethod("smnGotUpFromSeatTable", params);

	}
}
