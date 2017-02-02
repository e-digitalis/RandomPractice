/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moreForLoops;

public class For {

	public static void main(String[] args) {
		// exercises come from here:
		// http://www.worldbestlearningcenter.com/index_files/java-loops-for-exercises.htm

		int counter;
		int insideCounter;
		char star = '*';

		for (counter = 7; counter > 0; counter--) {
			for (insideCounter = 7; insideCounter > 0; insideCounter--) {
				System.out.print(star);
			}
			System.out.print(star);
			System.out.println();
		}

	}
}

