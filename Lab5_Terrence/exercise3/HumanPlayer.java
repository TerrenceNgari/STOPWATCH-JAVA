/**
 * Represents a human player in the Stone game.
 */
import java.util.Scanner;

// Use of inheritance concept
public class HumanPlayer extends Player {
	public HumanPlayer(String name) {
		super(name);
	}

	@Override
	public int pickStones(int remainingStones) {
		Scanner scanner = new Scanner(System.in);
		System.out.print(name + ", please enter how many stones you want to take (1, 2, or 3): ");
		int stones = scanner.nextInt();
		while (stones < 1 || stones > 3 || stones > remainingStones) {
			System.out.print("Invalid choice. Please enter 1, 2, or 3 stones: ");
			stones = scanner.nextInt();
		}
		return stones;
	}
}