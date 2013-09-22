package commands.customGame;

import gui.LobbyWindow;
import commands.Command;

public class SmnLeftTable extends Command {

	@Override
	public void execute(String... params) {
		LobbyWindow.callMethod("smnLeftTable", params);

	}

}
