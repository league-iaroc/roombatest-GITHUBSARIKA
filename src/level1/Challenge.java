package level1;

import processing.core.PApplet;

public class Challenge extends Head {
	Roomba roomba;

	public static void main(String[] args) {
		PApplet.main("level1.Processing");
	}

	public Challenge(Roomba roomba) {
		super(roomba);
	}

	/**
	 * Without touching the wall reach the endZone use sleep an driveDirect
	 */
	public void initialize() {
		// write code here!
		driveDirect(200, 200);
		sleep(3000);
		driveDirect(200, 300);
		sleep(4000);
		driveDirect(200, 200);
		sleep(14000);
		driveDirect(200, 300);

	}

	public void loop() {

	}
}
