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
public class Eternal_for_loop {

	public static void main(String[] args) {
		for (byte x = 0; x < 5; x--) {
			System.out.print("loop: " + x + " ");
		}

		for (byte x = 0; x < 5; x--) {
			System.out.println("loop: " + x);
		}

		for (byte x = 0; x < 5; x-=1) {
			System.out.println("loop: " + x);
		}

		
		

	}

}
