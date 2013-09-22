package commands.customGame;

import gui.LobbyWindow;
import commands.Command;

public class TableCreated extends Command {

	@Override
	public void execute(String... params) {
		LobbyWindow.callMethod("tableCreated", params);

	}

}
