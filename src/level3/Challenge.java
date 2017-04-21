package level3;

import processing.core.PApplet;

public class Challenge extends Head {
	Roomba roomba;

	public static void main(String[] args) {
		PApplet.main("level3.Processing");
	}

	public Challenge(Roomba roomba) {
		super(roomba);
	}

	void goStraight(int howlong) {
		driveDirect(200, 200);// straight
		sleep(howlong);
	}

	public void initialize() {
		goStraight(4000);
		driveDirect(200, 300);// turns left
		sleep(2000);
		goStraight(4000);
		driveDirect(300, 200);// turns right
		sleep(2000);
		goStraight(2000);
		driveDirect(200, 300);// turns left
		sleep(5000);
		goStraight(3000);
		driveDirect(300, 200);// turn right
		sleep(2000);
		goStraight(2000);
		driveDirect(200, 200);
		goStraight(2000);
		driveDirect(300, 200);

	}

	public void loop() {

	}
}
