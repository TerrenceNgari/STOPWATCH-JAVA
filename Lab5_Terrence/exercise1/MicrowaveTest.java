public class MicrowaveTest {
	// Main method
	public static void main(String[] args) {
		Microwave microwave = new Microwave(); // Use of pointer reference to declare a new variable


		microwave.increaseTime(); // increase Time method
		microwave.switchPowerLevel(); // switch the power level
		microwave.start(); // start method

		microwave.reset(); // reset method
		microwave.start(); // start method
	}
}