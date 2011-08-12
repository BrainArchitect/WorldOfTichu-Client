package main;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

import gamePackage.GameWindow;
import gui.FrameWithFlash;
import gui.LoginScreen;

import javax.swing.JOptionPane;
import javax.swing.UIManager;

import communicationPackage.ReaderThread;

public class Main {

	private static Socket socket;
	private static BufferedReader in;
	private static PrintWriter out;
	
	public Main(){
		try{
			socket = new Socket("localhost", 12345);
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = new PrintWriter(socket.getOutputStream());
			new ReaderThread(in).start();
		}catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
			System.exit(0);
		}
	}
	
	public static void sendMessage(String message){
		out.println(message);
		out.flush();
	}
	public static void main(String args[]){
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            new Main();
            new FrameWithFlash();
        } catch (Exception ex) {
            //DO NOTHING
        }
        
	}
}
