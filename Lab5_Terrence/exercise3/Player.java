/**
 * Abstract class representing a player in the Stone game.
 */
public abstract class Player {
	protected String name;

	public Player(String name) {
		this.name = name;
	}

	public abstract int pickStones(int remainingStones);

	public String getName() {
		return name;
	}
}