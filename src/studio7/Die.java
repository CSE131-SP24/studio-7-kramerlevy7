package studio7;

public class Die {
	private int sides;
	
	
	public Die(int sides) {
		this.sides=sides;
	}
	public int GetSides() {
		return sides;
	}
	
	public void SetSides(int newSides) {
		this.sides=newSides;
	}
	
	public int rollDie() {
		return (int)(Math.random()*sides)+1;
	}
}