package gui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;   
import java.awt.GridBagConstraints;   
import java.awt.GridBagLayout;   
import java.awt.Insets;   
import java.awt.event.ActionEvent;   
import java.awt.event.ActionListener;   

import javax.swing.BorderFactory;   
import javax.swing.JButton;   
import javax.swing.JFrame;   
import javax.swing.JLabel;   
import javax.swing.JPanel;   
import javax.swing.JTextField;   
import javax.swing.SwingUtilities; 

import chrriis.common.UIUtils;   
import chrriis.dj.nativeswing.swtimpl.NativeInterface;   
import chrriis.dj.nativeswing.swtimpl.components.FlashPlayerCommandEvent;   
import chrriis.dj.nativeswing.swtimpl.components.FlashPlayerListener;   
import chrriis.dj.nativeswing.swtimpl.components.JFlashPlayer;  

public class LoginScreen extends JPanel{

	/**
	 * 
	 */

	public LoginScreen(){
		
		//Initialization of Flash Panel and loading of the content.
		super(new BorderLayout());   
	    JFlashPlayer flashPlayer = new JFlashPlayer();   
	    flashPlayer.load(getClass(), "LoginScreen.swf");   
	    add(flashPlayer, BorderLayout.CENTER); 
	    
	    //Adding the action lister, in order to be able for Java to hear messages from Flash.
	    flashPlayer.addFlashPlayerListener(new FlashPlayerListener() {   
		      public void commandReceived(FlashPlayerCommandEvent e) {
		    	  System.out.println(e.getCommand());
		        
		    	  if("Exit".equals(e.getCommand())) {  //Exit Button pressed.
		            System.exit(0); 
		    	  } 
		    	  else if("Minizime".equals(e.getCommand())){  // Minimize Button pressed.
		    		  
		    	  }
		      }   
		    });
	}
	
	public static void main(String[] args) {
		UIUtils.setPreferredLookAndFeel();   
	    NativeInterface.open();   
	    SwingUtilities.invokeLater(new Runnable() {   
	      public void run() {   
	        JFrame frame = new JFrame("World of Tichu - Client");   
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   
	        frame.getContentPane().add(new LoginScreen(), BorderLayout.CENTER);   
	        frame.setSize(960, 540);   
	        frame.setLocationByPlatform(true);   
	        frame.setUndecorated(true);
	        frame.setVisible(true);
	        frame.setResizable(false);
	      }   
	    });   
	    NativeInterface.runEventPump();   
	
	
	}
}

