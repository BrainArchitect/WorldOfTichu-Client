package commands.customGame;

import gui.LobbyWindow;
import commands.Command;

public class ThisClientLeftTable extends Command {

	@Override
	public void execute(String... params) {
		LobbyWindow.callMethod("thisClientLeftTable", params);

	}

}
