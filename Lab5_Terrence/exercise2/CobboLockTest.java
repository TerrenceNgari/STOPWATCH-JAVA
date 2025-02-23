public class CobboLockTest {
	// Main method
	public static void main(String[] args) {
	 	int[] combination = {10, 20, 30};
		CobboLock lock = new CobboLock(combination);
		
		System.out.println(lock.open()); // false implementation

		lock.turnRight(10);	
		lock.turnLeft(10);
		lock.turnRight(10);

		
		System.out.println(lock.open()); // true implementation

		lock.reset();

		System.out.println(lock.open()); // false implementation
		}
	}
