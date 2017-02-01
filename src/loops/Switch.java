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

public class Switch {

	public static void main(String[] args) {

		int i = 7;

		switch (i) {
		case 6: System.out.println("The value was 6");	break;
		case 7: System.out.println("The value was 7");	break;
		default: System.out.println("Bluttoblä");
		}
		
		int dayNumber = 10;
		
		switch(dayNumber){
		case 0: System.out.println("måndag");break;
		case 1: System.out.println("tisdag");break;
		case 2: System.out.println("onsdag");break;
		case 3: System.out.println("torsdag");break;
		case 4: System.out.println("fredag");break;
		case 5: System.out.println("lördag");break;
		case 6: System.out.println("söndag");break;
		default:System.out.println("Something else");
		}
		

	}
}

