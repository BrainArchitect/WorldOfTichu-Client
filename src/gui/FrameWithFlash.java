package gui;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.File;
import java.io.FileNotFoundException;

import javax.swing.JFrame;

import main.Main;


import com.jpackages.jflashplayer.FlashPanel;
import com.jpackages.jflashplayer.JFlashInvalidFlashException;
import com.jpackages.jflashplayer.JFlashLibraryLoadFailedException;


public class FrameWithFlash extends JFrame {

	

	private static FlashPanel flashPanel;
	
	
	public FrameWithFlash(){
		FlashPanel.setRegistrationKey("123456");
		this.initProperties();
		this.createFlashPanel();
		this.centerAndDisplay();
	}
	
	
	private void initProperties(){
		this.setTitle("Testing Flash with JFlashPlayer");
		this.setSize(600, 400);
		this.setUndecorated(true);
		this.getContentPane().setLayout(new BorderLayout());
	}

	private void centerAndDisplay() {
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		Dimension frameSize = this.getSize();
		if (frameSize.height > screenSize.height) {
			frameSize.height = screenSize.height;
		}
		if (frameSize.width > screenSize.width) {
			frameSize.width = screenSize.width;
		}
		this.setLocation((screenSize.width - frameSize.width) / 2,
				(screenSize.height - frameSize.height) / 2);
		this.setVisible(true);
		this.toFront();
	}
	
	
	private void createFlashPanel() {
		String flashVersionRequired = "10";
		try {
			String flashFilePath = "LoginScreen.swf";
			
			FlashPanel.setRequiredFlashVersion(flashVersionRequired);
			// construct a FlashPanel displaying the SWF flash animation file
			flashPanel = new FlashPanel(new File(flashFilePath));
		} catch (JFlashLibraryLoadFailedException e) {
			System.out.println("A required library (DLL) is missing or damaged.");
		} catch (FileNotFoundException e) {
			System.out.println("Failed to find SWF file specified.");
		} catch (JFlashInvalidFlashException e) {
			System.out.println("Required version " + flashVersionRequired + " of Flash is not installed.");
		}
		
		this.add(flashPanel);
		
		// specify the object for Flash ExternalInterface.call events to search for the called method on
		flashPanel.setFlashCallObject(this);
		
		


				
	}
	

	//Flash "Pass" button clicked redirects here
	public void sendCommand(String msg){
		Main.sendMessage(msg);
	}
	
	public static void callMethod(String methodName, Object[] args){
		flashPanel.callFlashFunction(methodName, args);
	}




}
