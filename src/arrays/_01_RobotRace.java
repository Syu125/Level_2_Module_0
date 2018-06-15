package arrays;

import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	// 1. make a main method
	public static void main(String[] args) {
		Random r = new Random(50);
		Boolean run = false;
		int x = 50;
		int centerX = 300;
		int centerY = 300;
		int moveX = 10;
		// 2. create an array of 5 robots.
		Robot[] R = new Robot[6];
		Robot.setWindowSize(300, 300);
		// 3. use a for loop to initialize the robots.
		for (int i = 0; i < R.length; i++) {
			R[i] = new Robot();
		}
		// 4. make each robot start at the bottom of the screen, side by side, facing up
		for (int j = 0; j < R.length; j++) {
			R[j].setX(x);
			R[j].setY(550);
			x += 100;
		}
		// 5. use another for loop to iterate through the array and make each robot move
		// a random amount less than 50.

		/*
		 * for (int k = 0; k < R.length; k++) { R[k].move(r.nextInt(100)); run = true; }
		 */

		// 6. use a while loop to repeat step 5 until a robot has reached the top of the
		// screen.
		/*
		 * while (true) { for (int k = 0; k < R.length; k++) {
		 * R[k].move(r.nextInt(100)); run = true; // 7. declare that robot the winner
		 * and throw it a party! if (R[k].getY() <= 50) { System.out.println("Robot " +
		 * k + " wins!"); } } }
		 */
		while (true) {
			for (int k = 0; k < R.length; k++) {

				int moveY = (int) (Math.sqrt(100 - ((centerX - moveX) ^ 2)) - centerY);
				run = true;
				R[k].moveTo(moveX, moveY);
				// 7. declare that robot the winner and throw it a party!
				if (R[k].getY() <= 50) {
					System.out.println("Robot " + k + " wins!");
				}
			}
		}

		// 8. try different races with different amounts of robots.

		// 9. make the robots race around a circular track.

	}
}
