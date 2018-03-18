package section3;

import javax.swing.JOptionPane;

public class WorldDomination {
	
	public static void main(String[] args) {
		// 1. Ask the user if they know how to write code.
String answer = JOptionPane.showInputDialog("Can You Code");
		// 2. If they say "yes", tell them they will rule the world.
if (answer.equals("yes")) {
JOptionPane.showMessageDialog(null, "You will take over the world");
	
	
}
	
else if(answer.equals("no")){	
	
JOptionPane.showMessageDialog(null, "Good luck washing dishes.");	
}
}
}

