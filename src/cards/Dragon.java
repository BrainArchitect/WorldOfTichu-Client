package cards;

public class Dragon extends Card{

	public Dragon(int value, int color) {
		super(value, color);
		// TODO Auto-generated constructor stub
	}

	public boolean isDragon(){
		return true;
	}

	public int getPoints(){
		return 25;
	}
}
