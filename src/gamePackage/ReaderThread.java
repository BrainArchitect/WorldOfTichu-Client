package gamePackage;

import java.io.BufferedReader;

import javax.swing.JOptionPane;

import commands.Command;
import commands.CommandFactory;

public class ReaderThread extends Thread{

	private BufferedReader in;
	
	public ReaderThread(BufferedReader in){
		this.in = in;
	}
	
	public void run(){
		try{
			while (true){
				String input = in.readLine();
				JOptionPane.showMessageDialog(null, input);
				String[] params = input.split("~");
				Command command = CommandFactory.createCommand(params[0]);
				command.execute(params);
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
