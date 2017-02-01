/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loops;

/**
 *
 * @author User
 */
public class ForLoops {

	public static void main(String[] args) {

		int[] oneArray = { 11, 22, 33, 44, 55 };
		System.out.println("To check position start by printing: " + oneArray[0]);
		System.out.println();

		for (int count = 0; count < oneArray.length; count++) {
			System.out.print("Value of count is: " + count);
			System.out.print("		Array value at position " + count + " is " + oneArray[count]);
			System.out.println();

		}

	}

}

