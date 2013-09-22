package commands;

import commands.account.LoginReport;
import commands.contacts.*;
import commands.customGame.*;


public class CommandFactory {

	public static Command createCommand(String commandStr){
		if (commandStr.equals("1bR"))
			return new LoginReport();
		if (commandStr.equals("2aR"))
			return new AddInvitationReport();
		if (commandStr.equals("2a1R"))
			return new AddInvitationRequest();
		if (commandStr.equals("2bR"))
			return new ContactRemoved();
		if (commandStr.equals("2fR"))
			return new ChatMessageFromContact();
		if (commandStr.equals("2cR"))
			return new ContactsReport();
		if (commandStr.equals("2dR"))
			return new ContactCameOnline();
		if (commandStr.equals("2eR"))
			return new ContactWentOffline();
		if (commandStr.equals("2fR"))
			return new ChatMessageFromContact();
		if (commandStr.equals("2gR"))
			return new AddInvitationMultipleRequests();
		if (commandStr.equals("2a2R"))
			return new AddCompleted();
		if (commandStr.equals("3aR"))
			return new FetchCustomTables();
		if (commandStr.equals("3b1R"))
			return new MyTableCreated();
		if (commandStr.equals("3b2R"))
			return new TableCreated();
		if (commandStr.equals("3c1R"))
			return new ThisClientJoinedTable();
		if (commandStr.equals("3c2R"))
			return new SmnJoinedTable();
		if (commandStr.equals("3d1R"))
			return new ThisClientSatOnSeatTable();
		if (commandStr.equals("3d2R"))
			return new SmnSatOnSeatTable();
		if (commandStr.equals("3e1R"))
			return new ThisClientGotUpFromSeatTable();
		if (commandStr.equals("3e2R"))
			return new SmnGotUpFromSeatTable();
		if (commandStr.equals("3f1R"))
			return new ThisClientLeftTable();
		if (commandStr.equals("3f2R"))
			return new SmnLeftTable();
		if (commandStr.equals("3k1R"))
			return new MyTableDissolved();
		if (commandStr.equals("3k2R"))
			return new TableDissolved();
		if (commandStr.equals("3uR"))
			return new UpdatedTableValues();
		
		
		System.err.println(commandStr);
		return null;
	}	
}
