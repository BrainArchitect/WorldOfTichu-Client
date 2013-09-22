package commands.contacts;

import gui.LobbyWindow;
import commands.Command;

public class ContactCameOnline extends Command{

	@Override
	public void execute(String... params) {
		LobbyWindow.callMethod("contactCameOnline", params);
	}

}
