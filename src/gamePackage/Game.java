package gamePackage;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Game extends JFrame implements ActionListener, WindowListener{

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
		try{
			socket = new Socket("localhost", 12345);
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = new PrintWriter(socket.getOutputStream());
			new ReaderThread(in).start();
		}catch (Exception e) {
			e.printStackTrace();
		}
		commandField = new JTextField(20);
		commandField.addActionListener(this);
		sendBtn = new JButton("Send");
		sendBtn.addActionListener(this);
	
		JPanel p = new JPanel();
		p.add(commandField);
		p.add(sendBtn);
		addWindowListener(this);
		setContentPane(p);
		pack();
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		out.println(commandField.getText());
		out.flush();
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		try{
			socket.close();
		}catch (Exception e1) {
			e1.printStackTrace();
		}
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
