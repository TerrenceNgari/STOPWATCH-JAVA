/**
 * Represents the game board in the Stone game.
 */
public class GameBoard {
	//Use of accessmodifier
	private int remainingStones;

	//Parameterized constructor
	public GameBoard(int numberOfStones) {
		this.remainingStones = numberOfStones;
	}

	// Accessor method
	public int getRemainingStones() {
		return remainingStones;
	}

	public void removeStones(int stones) {
		remainingStones -= stones;
	}
	
	public boolean isGameOver() {
		return remainingStones == 0;
	}

	// Use of String toString method
	@Override
	public String toString() {
		return "Number of stones remaining: " + remainingStones;
	}
}