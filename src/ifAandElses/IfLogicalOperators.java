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

public class IfLogicalOperators {

	public static void main(String[] args) {

		int first = 8;
		int second = 12;

		if (second > first && first == 7) {
			System.out.println("both are true");
		} else {
			System.out.println("at least one is false");
		}

		// *************************************************

		int first2 = 8;
		int second2 = 6;

		if (second2 > first2 || first2 == 8) {
			System.out.println("at least one is true");
		} else {
			System.out.println("both are false");
		}

	}

}

