package main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MessageSenderForDebug{
	
  public static void create(){
	  JFrame frame = new JFrame("User" + Main.getUsername());
	  JButton button = new JButton("Show Input Dialog Box");
	  button.addActionListener(new ActionListener(){
		  public void actionPerformed(ActionEvent ae){
			  String str = JOptionPane.showInputDialog(null, "Enter some text : ","Roseindia.net", 1);
			  if(str != null)
				 Main.getLobbyWindow().sendCommand(str);
			  else
  JOptionPane.showMessageDialog(null, "You pressed cancel button.", 
"Roseindia.net", 1);
  }
  });
  JPanel panel = new JPanel();
  panel.add(button);
  frame.add(panel);
  frame.setSize(400, 400);
  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  frame.setVisible(true);
  }
}