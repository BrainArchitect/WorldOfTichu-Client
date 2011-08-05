package gamePackage;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Game extends JFrame implements ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField commandField;
	private JButton sendBtn;
	
	private Socket socket;
	private BufferedReader in;
	private PrintWriter out;
	
	public Game(){
		new ReaderThread(in).start();
		try{
			socket = new Socket("localhost", 12345);
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = new PrintWriter(socket.getOutputStream());
		}catch (Exception e) {
		}
		commandField = new JTextField(20);
		commandField.addActionListener(this);
		sendBtn = new JButton("Send");
		sendBtn.addActionListener(this);
	
		JPanel p = new JPanel();
		p.add(commandField);
		p.add(sendBtn);
		setContentPane(p);
		pack();
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		out.println(commandField.getText());
		out.flush();
	}
	
}
