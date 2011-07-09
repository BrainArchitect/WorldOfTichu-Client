package communicationPackage;

import java.io.BufferedReader;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import javax.swing.JOptionPane;

import patterns.CardPattern;
import patterns.CardPatternFactory;

import cards.Card;

public class ReaderThreadClient extends Thread {
			
	private BufferedReader in;

	private Socket socket;
			
	public ReaderThreadClient(BufferedReader in, Socket socket){
		this.in = in;
		this.socket = socket;

	}
	
	
	public void run() {
       try {
          while (true) {
        	  String msg = in.readLine();
        	  Scanner scanner = new Scanner(msg);
        	  scanner.useDelimiter("~");
			  String command = scanner.next();
			  System.out.println(msg);
        	  if (command == null)
        		  throw new Exception("Received a null message");
        	  	        
        	  /**
        	   * 
        	   * Command : addTable(s)
        	   * 
        	   * 
        	   * Function: Adds multiple Tables to TablesWindow. The number of tables that
        	   * must be added is specified by the SIZE parameter  
        	   * 
        	   * Parameters: 
        	   * 1. size: Number of Tables that must be added to TablesWindow 
        	   *          (size != 1 only when logs in.)
        	   * 2. tableID
        	   * 3. hosterName
        	   * 4. isPrivate
        	   * 5. Started
        	   * 6. Points
        	   * 7. hours
        	   * 8. minutes
        	   * 
        	   */
        	  else if (command.equals("aT")){
        		  int size = Integer.parseInt( scanner.next() );
        		  
        		  String tableID, hosterName, points, totalMinutes;
        		  boolean is_private, started;
        		  
        		  for (int i=0; i<size; i++){
            		  tableID = scanner.next();
            		  hosterName = scanner.next();
            		  is_private = Boolean.parseBoolean( scanner.next() );
            		  started = Boolean.parseBoolean(scanner.next());
            		  points = scanner.next();
            		  totalMinutes = scanner.next();
            		  String hours = String.valueOf( Integer.valueOf(totalMinutes)/60 );
            		  String mins =  String.valueOf( Integer.valueOf(totalMinutes)%60 );
            		  
            		  //Code for adding a table to TablesWindow    

        		  }
        	  }
        	  
        	  /**
        	   * 
        	   * Command : multiple joinTable
        	   * 
        	   * 
        	   * Function: multiple Players join Tables in TablesWindow. The number of joins is 
        	   * specified by the SIZE parameter. 
        	   * 
        	   * Parameters: 
        	   * 1. size: Number of joins that must be added to TablesWindow 
        	   *          (size != 1 only when logs in.)
        	   * 2. tableID
        	   * 3. playerName
        	   * 4. seatNo
        	   */
        	  else if (command.equals("uT")){
        		  int size = Integer.parseInt( scanner.next() );
        		  
        		  for (int i=0; i<size; i++){
	        		  String tableID = scanner.next();
	        		  String playerName = scanner.next();
	        		  int seatNo = Integer.parseInt( scanner.next() );

	        		// Code for joining a table


        		  }
        	  }
        	  
        	  /**
        	   * Command : Remove a Table
        	   * 
        	   * Parameters :
        	   * 1. tableID
        	   */
        	  else if (command.equals("rm")){
        		  String tableID = scanner.next();
        		  
        		// Code for removing a table
      		 
        	  }
        	  
        	  /**
        	   * Command : Leave a Table
        	   * 
        	   * Parameters :
        	   * 1. tableID
        	   * 2. seatNo
        	   */
        	  else if (command.equals("lT")){
        		  String tableID = scanner.next();
        		  int seatNo = Integer.parseInt( scanner.next() );
        		  
        		//Code for leaving a table 
    		  
        	  }
        	  
        	  /**
        	   * Command : SignIn
        	   * 
        	   * Function: multiple Players sign in. The number of signs in is 
        	   * specified by the SIZE parameter. 
        	   * 
        	   * Parameters: 
        	   * 1. size: Number of signs in that must be added to TablesWindow 
        	   *          (size != 1 only when logs in.)
        	   * 
        	   * 2.user
        	   */
        	  else if (command.equals("signIn")){
        		  int size = Integer.parseInt( scanner.next() );
        		  
        		  for (int i=0; i<size; i++){
        			  String user = scanner.next();
        			 
        			  //Code for signing in

        		  }
        	  }
        	  
        	  /**
        	   * Command : Disconnect a user
        	   * 
        	   * Parameters :
        	   * 1. username
        	   */
        	  else if (command.equals("dc")){
        		  String username = scanner.next();
        		  
        		// Code for signing out

        	  }


        	  
        	  else if(command.equals("chatLobby")){
        		  String senderName = scanner.next();
        		  String message = scanner.next();
        		  
        		  //Code for adding the message in TablesWindow Chat
        		  //by user with userName==senderName goes here.

        	  }
        	  
        	  else if(command.equals("chatGame")){
        		  String senderName = scanner.next();
        		  String message = scanner.next();
        		  
        		  //Code for adding the message in GamesWindow Chat
        		  //by user with userName==senderName goes here.

        	  }
        	  
        	  
        	  //Game Started
        	  else if(command.equals("gS")){
        		  
        	  }
        	  
        	  
        	  //DEAL CARDS MESSAGE
        	  else if(command.equals("dC")){
        		  int numOfCards = Integer.parseInt(scanner.next());
        		  int value;
        		  int color;

        		  ArrayList<Card> cardsArrayList = new ArrayList<Card>();
        		  
        		  String card = "";
        		  for(int i=0; i<numOfCards; i++){
        			  card = scanner.next();
        			  
        			  value=Integer.parseInt(card.substring(0, 2));
        			  color= Integer.parseInt(card.substring(2, 3));
        			  cardsArrayList.add(new Card(value, color));
        		  }	
        		  
        		  Collections.sort(cardsArrayList);
        		  Collections.reverse(cardsArrayList);
        		  
        		  //From above we only need the cardsArrayList and the numOfCards
        		  
        	  }
        	  
        	  //Exchanged Cards --> Cards have arrived from other players
        	  else if(command.equals("eC")){
        		  
        		  	ArrayList<Card> cards = new ArrayList<Card>();
        			for (int i=0; i<3; i++){
        				//int seatNo = Integer.parseInt(scanner.next());
        				String cardStr = scanner.next();
        				int value = Integer.parseInt(cardStr.substring(0,2));
        				int color = Integer.parseInt(cardStr.substring(2, 3));
        				
        				//Card which was send from player identified by seatNo
        				Card card = new Card(value,color);
        				
        				//Code for adding the card in the appropriate classes
        				//and to show the card in the correct cell of the panel goes here
        				cards.add(card);
        				
        			
        			}
        		  
        	  }
        	  
        	  
        	  //GiveTurn --> Shows who has the mahjong in order to play first
        	  else if(command.equals("gT")){
        		  
        		  //this is the number of the seat of the player who has the mahjong
        		  int seatNo = Integer.parseInt(scanner.next());
        		  
        		  // Code for modifying the appropriate classes and
        		  // enabling/disabling the corresponding buttons goes here
        		  
        		  
        	  }else if (command.equals("tichu")){
        		  //TO DO
        		  int seatNo = Integer.parseInt(scanner.next());
        		  int tichuType = Integer.parseInt(scanner.next());
        		  System.out.println("Tichu type : " + tichuType);


        	  }
        	  
        	  else if(command.equals("CPT")){
        		  int size = Integer.parseInt(scanner.next());
        		  
        		  ArrayList<Card> cards = new ArrayList<Card>();
        		  
        		  for(int i=0;i<size;i++){
        			  String cardStr = scanner.next();
        			  int value = Integer.parseInt(cardStr.substring(0,2));
      				  int color = Integer.parseInt(cardStr.substring(2, 3));

      				  Card card = new Card(value,color);
      				  

      				  cards.add(card);
        			  
        		  }
        		  
        		  CardPatternFactory cpFactory = new CardPatternFactory();
        		  CardPattern cp = cpFactory.createCardPattern(cards);


        		  int senderSeat = Integer.parseInt(scanner.next());
        		  int nextPlayerSeat =Integer.parseInt(scanner.next());
        		  

 
        	  }else if(command.equals("clear")){

        	  }
        	  
//================================================================================
// The following messages must be filled with the appropriate actions
//================================================================================
        	  
        	  //End of a match
        	  else if(command.equals("eoh")){
        		  
        		  int team1points = Integer.parseInt(scanner.next());
        		  int team2points =Integer.parseInt(scanner.next());
        		  
        		  
        		  //Code for showing the points to the gameWindow
        		  //goes here.
  
        	  }
        	  
        	  //End of the game --> a team has reached the pointsLimit 
        	  else if(command.equals("eog")){
        		  
        		  int team1FinalPoints = Integer.parseInt(scanner.next());
        		  int team2FinalPoints =Integer.parseInt(scanner.next());
        		  
        		//Code for showing the winning team goes here!!!
 

        	  }
        	  

        	  
        	  
        	  //Whatever error happens in server 
        	  else if (command.equals("1")){
        		  //Print the corresponding failure message
        	  }else{
        		  throw new Exception("Illegal data received from server.");
        	  }
        		          	  
        	  scanner.close();
          }    
       }
       catch (Exception e) {
             JOptionPane.showMessageDialog(null,
                   "Connection to the server was closed.\n",
                   "Error", JOptionPane.ERROR_MESSAGE);
             e.printStackTrace();
             try{
            	socket.close();
 				Thread.sleep(10);
 				System.exit(0);
             }catch (Exception e1) {}
       }
	}
}