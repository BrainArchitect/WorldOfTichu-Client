package commands.contacts;

import gui.LobbyWindow;
import commands.Command;

public class ChatMessageFromContact extends Command{

	@Override
	public void execute(String... params) {
		LobbyWindow.callMethod("chatMessageFromContact", params);
	}

}
