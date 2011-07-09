package main;

import javax.swing.UIManager;

public class Main {

	public static void main(String args[]){
	   
		// Install the system's look and feel;
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception ex) {
            //DO NOTHING
        }
        
	}
}
