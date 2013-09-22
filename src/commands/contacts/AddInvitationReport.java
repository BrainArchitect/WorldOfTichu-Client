package commands.contacts;

import gui.LobbyWindow;
import commands.Command;


public class AddInvitationReport extends Command{

	/**
	 * Impelements 2aR requirement
	 */
	@Override
	public void execute(String... params) {
		LobbyWindow.callMethod("addInvitationReport", params);
	}

}
