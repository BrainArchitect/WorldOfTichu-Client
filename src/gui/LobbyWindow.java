package gui;

import java.awt.BorderLayout;
import java.awt.Dimension;

import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.File;
import java.io.FileNotFoundException;

import javax.swing.JFrame;

import main.Main;

import com.jpackages.jflashplayer.FlashPanel;
import com.jpackages.jflashplayer.JFlashInvalidFlashException;
import com.jpackages.jflashplayer.JFlashLibraryLoadFailedException;


public class LobbyWindow extends JFrame {

	private static FlashPanel flashPanel;

	public LobbyWindow(){
		FlashPanel.setRegistrationKey("123456");
		this.initProperties();
		this.createFlashPanel();
		this.centerAndDisplay();
	}
	
	
	private void initProperties(){
		this.setTitle("Testing Flash with JFlashPlayer");
		this.setSize(1200, 900);
		this.setUndecorated(true);
		this.getContentPane().setLayout(new BorderLayout());
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.addWindowListener(
				new WindowListener(){
		            public void windowClosing(WindowEvent e)
		            {
		            	flashPanel.dispose();
		            }
		            public void windowOpened(WindowEvent e) {}
		            public void windowClosed(WindowEvent e) { }
		            public void windowIconified(WindowEvent e) {}
		            public void windowDeiconified(WindowEvent e){}
		            public void windowActivated(WindowEvent e) {}
		            public void windowDeactivated(WindowEvent e) {}
		        }
		);

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
			String flashFilePath = "LobbyWindow4_3.swf";
			
			FlashPanel.setRequiredFlashVersion(flashVersionRequired);
			// construct a FlashPanel displaying the SWF flash animation file
			flashPanel = new FlashPanel(new File(flashFilePath));
			flashPanel.setMenuDisplay(false);
		} catch (JFlashLibraryLoadFailedException e) {
			System.out.println("A required library (DLL) is missing or damaged.");
		} catch (FileNotFoundException e) {
			System.out.println("Failed to find SWF file specified.");
		} catch (JFlashInvalidFlashException e) {
			System.out.println("Required version " + flashVersionRequired + " of Flash is not installed.");
		}
		
		this.add(flashPanel, BorderLayout.CENTER);
		
		// specify the object for Flash ExternalInterface.call events to search for the called method on
		flashPanel.setFlashCallObject(this);
	
	}
	

	//Flash "Pass" button clicked redirects here
	public void sendCommand(String msg){
		System.out.println(msg);
		if(msg.equals("Exit")){
			Main.shutDown();
			//this.close();
			///Thread.currentThread().interrupt();
		}else if(msg.equals("Minimize")){
			this.setExtendedState(JFrame.ICONIFIED);
		}else{
			Main.sendMessage(msg);
		}
	}
	
	public static void callMethod(String methodName, Object[] args){
		try{
			flashPanel.callFlashFunction(methodName, args);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	
		public void close(){
		this.dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
	}




}
