package commands.customGame;

import gui.LobbyWindow;
import commands.Command;

public class MyTableCreated extends Command {

	@Override
	public void execute(String... params) {
		LobbyWindow.callMethod("myTableCreated", params);
	}

}
