package clientPackage;

import java.awt.Image;
import java.util.ArrayList;

import cards.Card;

public class Player {

	//===================================================================
	//THIS IS OKAN - TASOS AREA - PLEASE DO ENTER. OTHERS MAY TOUCH
	//THE CODE AND MODIFYING IT FOR ANY REASON
	//===================================================================
	private String username;
	private Image image;

	public Player(String username, Image image){
		this.username = username;
		this.image = image;
	}

	public String getUsername(){ 
		return username;
	}
	public Image getImage() {
		return image; 
	}
	
	
	//===================================================================
	//THIS IS FILOTAS - GIORGOS AREA - DO NOT ENTER. OTHERS MAY NOT TOUCH
	//THE CODE OR MODIFYING IT AT ANY REASON
	//===================================================================
	/*
	Seat is an int variable.
	The players get their number by the time they enter the table.
	Their number depends on the seat they choose. Host always has the seat -0-.
	The player who sits in position to play after the host takes seat -1-
	The player in the team of host takes the seat -2-
	The player before the host takes seat -3-
	*/
	private int seat;
	
	// Turn is true only for the player that is currently playing
	private boolean turn;
	
	//TrickWinner is true only for the player that wins the trick
	private boolean trickWinner;
	
	//The cards that the player has at his hand
	private ArrayList<Card> cards = new ArrayList<Card>();
		
	//LargeTichu becomes true when the player declares it.
	private boolean largeTichu;
	
	//SmallTichu becomes true when the player declares it.
	//Cannot Say SmallTichu if LargeTichu is activated or 
	//the player has toss one or more cards.
	private boolean smallTichu;

	
	
	public void setSeat(int s){
		seat = s;
	}
	
	public int getSeat(){
		return seat;
	}
	
	public void setTurn(boolean t){
		turn = t;	
	}	
	
	public boolean getTurn(){
		return turn;
	}
	
	public boolean isTrickWinner(){
		return trickWinner;
	}
	
	public void setTrickWinner(boolean trickWinner){
		this.trickWinner=trickWinner;
	}


	public void addCard(Card c){
		this.cards.add(c);
	}
	
	public Card getCard(int index){
		return cards.get(index);
	}
	
	public ArrayList<Card> getCards(){
		return cards;
	}
	
	public void setCards(ArrayList<Card> c){
		cards =c;
	}
	
	public int getNumOfCards(){
		return cards.size();
	}
	
	
	public boolean isLargeTichu() {
		return largeTichu;
	}

	public void setLargeTichu(boolean largeTichu) {
		this.largeTichu = largeTichu;
	}
	
	public boolean isSmallTichu() {
		return smallTichu;
	}

	public void setSmallTichu(boolean smallTichu) {
		this.smallTichu = smallTichu;
	}



}
