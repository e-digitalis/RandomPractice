/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strings;

/**
 *
 * @author User
 */


public class ComparingStrings {

	public static void main(String[] args) {

		String myName = "Lilla Li";
		String friendName = "Lilla My";

		String myFirstName = myName.substring(0, 5);
		String myFriendName = friendName.substring(0, 5);

		System.out.println(myFirstName);
		System.out.println(myFriendName);

		if (myFirstName == myFriendName) { 					// == does not work for strings!!!
			System.out.println("we have the same name");
		}else{
			System.out.println("our names are different");
		}

		
		if (myFirstName.equals(myFriendName)) {
			System.out.println("we have the same name");
		}else{
			System.out.println("our names are different");
		}

			
					
	}

}
