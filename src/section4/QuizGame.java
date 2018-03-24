package section4;

import javax.swing.JOptionPane;

public class QuizGame {
	
	public static void main(String[] args) {
		
		// 1.  Create a variable to hold the user's score 
		int Score = 0;
		// 2.  Ask the user a question 
		String answer = JOptionPane.showInputDialog("What is Life?");
		// 3.  Use an if statement to check if their answer is correct
		if (answer.equals("42")) {
			
		Score ++;
		}
		JOptionPane.showMessageDialog(null, Score);
		// 4.  if the user's answer is correct
		
		// -- add one to their score 
		
		// 5.  Create more questions by repeating steps 1, 2, and 3 below. 
		answer = JOptionPane.showInputDialog("How old am I?");
		// 6.  After all the questions have been asked, print the user's score 
		if (answer.equals("13")) {
			
			Score ++;
			}
		JOptionPane.showMessageDialog(null, Score);
	
		 answer = JOptionPane.showInputDialog("What is a sponge?");
			
			if (answer.equals("a sponge")) {
				Score ++;
			}
		
			JOptionPane.showMessageDialog(null, Score);
		
			 answer = JOptionPane.showInputDialog("Spaghetti stastes like?");
				
				if (answer.equals("water")) {
					Score ++;
				}
			
				JOptionPane.showMessageDialog(null, Score);
			
				 answer = JOptionPane.showInputDialog("what is a star");
					
					if (answer.equals("a ball of gas")) {
						Score ++;
					}
				
					JOptionPane.showMessageDialog(null, Score);
				
					 answer = JOptionPane.showInputDialog("the earth's core is made of?");
						
						if (answer.equals("molten metal")) {
							Score ++;
						}
					
						JOptionPane.showMessageDialog(null, Score);
					
						 answer = JOptionPane.showInputDialog("nar?");
							
							if (answer.equals("whale")) {
								Score ++;
							}
						
							JOptionPane.showMessageDialog(null, "Your Score is "  +Score);
							
							
							
						
		
		
	
	}
}
