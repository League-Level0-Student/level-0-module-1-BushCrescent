package _07_riddler;
//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

import javax.swing.JOptionPane;

public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
int score = 0;

		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
String riddle = JOptionPane.showInputDialog("During which month do people sleep the least?");
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
if(riddle.equals("February")) {
		JOptionPane.showMessageDialog(null, "Correct!");
		score ++;
	// 5. Otherwise, say "wrong" and tell them the answer
}else { 
	JOptionPane.showMessageDialog(null, "Wrong, it's February, since that is the month with the least amount of days.");
	
}
		
// 6. Add some more riddles

		// 2. Make a pop up to show the score.
JOptionPane.showMessageDialog(null, "You have answered " + score + " riddle correct!");
		
	}
}

