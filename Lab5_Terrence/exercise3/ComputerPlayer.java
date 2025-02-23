/**
 * Represents a computer player in the Stone game.
 */
public class ComputerPlayer extends Player {
	public ComputerPlayer(String name) {
		super(name);
	}

	@Override
	public int pickStones(int remainingStones) {
		// Simple strategy for computer player: always take 1 stone
		return 1;
	}
}