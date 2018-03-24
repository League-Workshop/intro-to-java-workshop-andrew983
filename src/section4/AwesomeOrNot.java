package section4;

import java.util.Random;

import javax.swing.JOptionPane;

public class AwesomeOrNot {

	public static void main(String[] args) {
		int random = new Random().nextInt(4);
		
		System.out.println(random);
		
		String answer = JOptionPane.showInputDialog(null, "What Is Awesome?");
		
		if(random == 0) {
			
			JOptionPane.showMessageDialog(null, "That's Awesome!");
			
		}
		
		
		if(random == 1) {
			
			JOptionPane.showMessageDialog(null, "That's ... oK?");
			
		}
		
		
		
		if(random == 2) {
			
			JOptionPane.showMessageDialog(null, "That's boring, give me ice cream");
			
		}
		
		
		
		if(random == 3) {
			
			JOptionPane.showMessageDialog(null, "no u");
			
		}
		
		
		
		
		
		
		
		
	}
	// 1. Make a main method that includes all the steps below…

	// 2. Make a variable that will hold a random number and put a random number into this variable using "new Random().nextInt(4)"

	// 3. Print out this variable

	// 4. Get the user to enter something that they think is awesome

	// 5. If the random number is 0

	// -- tell the user whatever they entered is awesome!

	// 6. If the random number is 1

	// -- tell the user whatever they entered is OK.

	// 7. If the random number is 2

	// -- tell the user whatever they entered is boring.

	// 8. If the random number is 3

	// -- write your own answer

}


