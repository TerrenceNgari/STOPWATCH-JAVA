public class CobboLock {
	// use of private access modifier to declare variables
	private int[] combination;
	private int currentNumber;
	
	public CobboLock(int[] combination) {
		if (combination.length != 3) {
			throw new IllegalArgumentException("Combination must have three numbers.");
		}

	
		for (int num : combination) {
			if (num < 0 || num > 39) {
				throw new IllegalArgumentException("Combination numbers must be between 0 and 39.");
			}
		}

		this.combination = combination;
		this.currentNumber = 0;
	}
	
	// Reset method
	public void reset() {
		this.currentNumber = 0;
	}

	// turnLeft method
	public void turnLeft(int ticks) {
		this.currentNumber = (this.currentNumber - ticks + 40) % 40;
	}

	// turnRight method
	public void turnRight(int ticks) {
		this.currentNumber = (this.currentNumber + ticks) % 40;
	}

	// open loop method
	public boolean open() {
		if (currentNumber == combination[0]) {
			turnRight(40 - currentNumber);
			if (currentNumber == combination[1]) {
				turnLeft(currentNumber - combination[1]);
				if (currentNumber == combination[2]) {
					return true;
				}
			}
		}
		reset();
		return false;
	}
	}
		




























