public class Microwave {
	private int time;
	private int powerLevel;

	public Microwave() {
		this.time = 0;
		this.powerLevel = 1;
	}

	// increase the time
	public void increaseTime() {
		this.time += 30;
	}

	// swtich the power level
	public void switchPowerLevel() {
		this.powerLevel = (this.powerLevel == 1) ? 2 : 1;
	}

	// reset method
	// use of this keyword
	public void reset() {
		this.time = 0;
		this.powerLevel = 1;
	}

	public void reset() {
		this.time = 0;
		this.powerLevel = 1;
	}

	// Use of start method
	public void start() {
		System.out.println("Cooking for" + time + " seconds at level " + powerLevel);
	} }