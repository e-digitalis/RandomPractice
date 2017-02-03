/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifAandElses;

/**
 *
 * @author User
 */

import javax.swing.JOptionPane;
import moreForLoops.GameLoop;

public class DoYouWantToPlay {

	public static void playQuestion(int newResult) {

		int result = JOptionPane.showConfirmDialog(null, "Do you want to play?", null, JOptionPane.YES_NO_OPTION);

		if (result == JOptionPane.YES_OPTION) {
//		if (result == JOptionPane.YES_OPTION || newResult == JOptionPane.YES_OPTION) {
			JOptionPane.showMessageDialog(null, "OK, let's play!");
			GameLoop.realGame(RandomNumberGenerator.createRandomNumber());
		} else {
			JOptionPane.showMessageDialog(null, "Thank you! We can play another day!");
		}
	}
}

