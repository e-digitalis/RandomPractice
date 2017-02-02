/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eternalLoops;

/**
 *
 * @author User
 */

public class Eternal_loop2 {

	public static void main(String[] args) {
		
		
		
		for (int x = 0; x < 5; x--) {
			System.out.println("loop: " +x);
		}
		
		
		for (int x = 10; x == 10;) { // it will run "as long as the
			// condition is met" so FOREVER
		}
	}

}
