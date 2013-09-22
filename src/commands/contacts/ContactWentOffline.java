package commands.contacts;

import gui.LobbyWindow;
import commands.Command;

public class ContactWentOffline extends Command{

	@Override
	public void execute(String... params) {
		LobbyWindow.callMethod("contactWentOffline", params);
		
	}

}
