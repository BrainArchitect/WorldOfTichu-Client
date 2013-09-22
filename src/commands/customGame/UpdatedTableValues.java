package commands.customGame;

import gui.LobbyWindow;
import commands.Command;

public class UpdatedTableValues extends Command{

	@Override
	public void execute(String... params) {
		LobbyWindow.callMethod("updatedTableValues", params);
		
	}

}
