package arrays;


import java.util.ArrayList;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	//1. make a main method
		public static void main(String[] args) {
			
	//2. create an array of 5 robots.
		Robot[]R = new Robot[5];
		Robot.setWindowSize(300, 300);
	//3. use a for loop to initialize the robots.
		for(int i = 0; i < R.length; i++) {
			R[i] = new Robot();
		}
		//4. make each robot start at the bottom of the screen, side by side, facing up
		for(int j = 0;j<R.length; j++) {
			R[j].mouseMove(20, 300);
		}
	//5. use another for loop to iterate through the array and make each robot move 
	//   a random amount less than 50.

	//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.

	//7. declare that robot the winner and throw it a party!

	//8. try different races with different amounts of robots.

	//9. make the robots race around a circular track.
}
}

