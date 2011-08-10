package main;

import gamePackage.GameWindow;
import gui.LoginScreen;
import javax.swing.UIManager;

public class Main {

	public static void main(String args[]){
	   
		// Install the system's look and feel;
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            new GameWindow();
            new LoginScreen();
        } catch (Exception ex) {
            //DO NOTHING
        }
        
	}
}
