package commands.account;

import main.Main;
import gui.LobbyWindow;
import gui.LoginWindow;

import com.jpackages.jflashplayer.FlashPanel;

import commands.Command;


public class LoginReport extends Command{	
	/**
	 * *PART OF THE LOGIN REQUIREMENT <br><br>
	 *
	 * Message: Login Report <br>
	 * Params : 1bR, success <br><br>
	 *
	 * For allowing the client to login the following condition must be met:<br>
	 * <li> success = true <br><br>
	 *
	 *Actions Taken When Conditions Are Met:<br>
	 *<li>Open the LobbyWIndow.<br><br>
	 *
	 */
	@Override
	public void execute(String... params) {
		LoginWindow.callMethod("loginReport", params);
		if(params[1]=="true"){
			Main.getLoginWindow().close();
			new LobbyWindow();
		}
		
	}
}
