package main;

import gamePackage.GameWindow;

import javax.swing.UIManager;

public class Main {

	public static void main(String args[]){
	   
		// Install the system's look and feel;
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            new GameWindow();
        } catch (Exception ex) {
            //DO NOTHING
        }
        
	}
}
