package commands;

import commands.account.LoginReport;
import commands.contacts.AddInvitationReport;
import commands.contacts.AddInvitationRequest;
import commands.contacts.ChatMessageFromContact;
import commands.contacts.ContactRemoved;

public class CommandFactory {

	public static Command createCommand(String commandStr){
		if (commandStr.equals("1bR"))
			return new LoginReport();
		if (commandStr.equals("2a"))
			return new AddInvitationReport();
		if (commandStr.equals("2a1"))
			return new AddInvitationRequest();
		if (commandStr.equals("2b"))
			return new ContactRemoved();
		if (commandStr.equals("2f"))
			return new ChatMessageFromContact();
		
		return null;
	}	
}
