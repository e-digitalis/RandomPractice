/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moreForLoops;

/**
 *
 * @author User
 */


import ifAandElses.DoYouWantToPlay;
import javax.swing.JOptionPane;
import randompractice.RandomNumberGenerator;

public class GameLoop {

	public static void realGame(int rVToGuess) {

		String guess = JOptionPane.showInputDialog("Please guess a number, any number from 0-10!");
		int intGuess = Integer.parseInt(guess);

		while (intGuess != rVToGuess) {
			if (intGuess > rVToGuess) {

				guess = JOptionPane.showInputDialog("Too big, guess a smaller number");
				intGuess = Integer.parseInt(guess);

			}
			if (intGuess < rVToGuess) {
				guess = JOptionPane.showInputDialog("Too small, guess a bigger number");
				intGuess = Integer.parseInt(guess);
			}
		}

		JOptionPane.showMessageDialog(null, "Wow! You got it! Good job!");
		DoYouWantToPlay.playQuestion(RandomNumberGenerator.createRandomNumber());

	}
}

    
}
