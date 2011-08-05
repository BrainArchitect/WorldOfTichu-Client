package main;

import gamePackage.Game;

import javax.swing.UIManager;

public class Main {

	public static void main(String args[]){
	   
		// Install the system's look and feel;
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            new Game();
        } catch (Exception ex) {
            //DO NOTHING
        }
        
	}
}
