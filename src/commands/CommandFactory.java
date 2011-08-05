package commands;

import commands.account.Login;
import commands.contacts.AddInvitation;
import commands.contacts.AddInvitationReply;
import commands.contacts.BuddyChat;
import commands.contacts.RemoveContact;

public class CommandFactory {

	public static Command createCommand(String commandStr){
		if (commandStr.equals("1b"))
			return new Login();
		if (commandStr.equals("2a"))
			return new AddInvitation();
		if (commandStr.equals("2a1"))
			return new AddInvitationReply();
		if (commandStr.equals("2b"))
			return new RemoveContact();
		if (commandStr.equals("2f"))
			return new BuddyChat();
		
		return null;
	}	
}
