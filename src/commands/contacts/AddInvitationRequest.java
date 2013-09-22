package commands.contacts;

import gui.LobbyWindow;
import commands.Command;


public class AddInvitationRequest extends Command{

	/**
	 * Implements 2a1 requirement
	 */
	@Override
	public void execute(String... params) {
		LobbyWindow.callMethod("addInvitationRequest", params);
	}
	
}
