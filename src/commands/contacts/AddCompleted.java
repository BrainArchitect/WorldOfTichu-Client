package commands.contacts;

import gui.LobbyWindow;
import commands.Command;

public class AddCompleted extends Command{

	@Override
	public void execute(String... params) {
		LobbyWindow.callMethod("addCompleted", params);
	}

}
