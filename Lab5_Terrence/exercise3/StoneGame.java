/**
 * Main class that controls the flow of the Stone game.
 */
import java.util.Scanner;

public class StoneGame {
	private GameBoard board;
	private Player player1;
	private Player player2;
	private Scanner scanner;

	public StoneGame(int numberOfStones, Player firstPlayer) {
		this.board = new GameBoard(numberOfStones);
		this.player1 = firstPlayer;
		this.player2 = new ComputerPlayer("Computer");
		this.scanner = new Scanner(System.in);
	}

	public void play() {
		Player currentPlayer = player1;
		Player otherPlayer = player2;
	
		while (!board.isGameOver()) {
			System.out.println(board);

			int stonesPicked = currentPlayer.pickStones(board.getRemainingStones());
			board.removeStones(stonesPicked);

			Player temp = currentPlayer;
			currentPlayer = otherPlayer;
			otherPlayer = temp;
		}

		System.out.println(board);
		System.out.println(currentPlayer.getName() + " wins!");
	}

	public boolean playAnotherGame() {
		System.out.println("Do you want to play another game? (Y/N)");
		String choice = scanner.next();
		return choice.equalsIgnoreCase("Y");
	}

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Welcome to the Game of Stone!");
		System.out.print("Please enter the number of stones to be used in this game: ");
		int numberOfStones = scanner.nextInt();

		System.out.print("Enter your name: ");
		String playerName = scanner.next();
		Player humanPlayer = new HumanPlayer(playerName);

		System.out.println("Which player will start the game? Select a number from the following:\n" +
			"1. Computer\n" +
			"2. " + playerName + "\n" +
			"Choice: ");
		int firstPlayerChoice = scanner.nextInt();
		Player firstPlayer = (firstPlayerChoice == 1) ? humanPlayer : new ComputerPlayer("Computer");

		StoneGame game = new StoneGame(numberOfStones, firstPlayer);
		do {
		     game.play();
		} while (game.playAnotherGame());

		System.out.println("Thanks for playing.");
	}
}