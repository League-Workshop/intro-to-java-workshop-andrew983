package section2;

import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

public class FourSquare {
	
	// 2. Create a new Robot
Robot beashrimp = new Robot();
	void go() {
		// 4. Make the robot move as fast as possible

		// 5. Set the pen width to 5

		// 6. Use a for loop to repeat steps #7 to #8, four times...

			// 7. Set the pen color to random
	

		
		
			for(int i=0;i<300;i++) {
drawSquare();	beashrimp.setRandomPenColor();
		}		




// 8. Turn the robot 90 degrees to the right

	}
// Fill in he code to do a drawsquare83ihde
	void drawSquare() {
	
beashrimp.setSpeed(200);
		beashrimp.penDown();
		beashrimp.move(100);
		beashrimp.turn(90);
		beashrimp.move(100);
		beashrimp.turn(90);
		beashrimp.move(100);
		beashrimp.turn(90);
		
	beashrimp.move(100);
		
		
	}

	
	
	
	
	public static void main(String[] args) {                 
		new FourSquare().go();
	}

}



