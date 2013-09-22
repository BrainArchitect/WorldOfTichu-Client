package communicationPackage;

import java.io.BufferedReader;
import javax.swing.JOptionPane;

import commands.Command;
import commands.CommandFactory;


public class ReaderThread extends Thread {
			
	private BufferedReader in;

			
	public ReaderThread(BufferedReader in){
		this.in = in;
		this.setDaemon(true);
	}
	
	public void run(){
		try{
			while (true){
				String input = in.readLine();
				JOptionPane.showMessageDialog(null,"Message Received: "+input);
				String[] params = input.split("~");
				//JOptionPane.showMessageDialog(null,"Message Received: "+input);
				Command command = CommandFactory.createCommand(params[0]);
				command.execute(params);
			}
		}catch (Exception e) {
			JOptionPane.showMessageDialog(null,"error");
			e.printStackTrace();
		}
	}
	

	

}