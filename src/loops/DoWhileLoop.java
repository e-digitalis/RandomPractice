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
public class DoWhileLoop {

	public static void main(String[] args) {

		int[] myArray = {11,12,45,14,10,56,23,78,18,62};
		int numberUsed = 0;
		int total = 500;
		
		do{
			total+=myArray[numberUsed];
			numberUsed++;
		}while (total<250);
		
		System.out.println();
		System.out.println("Total got to amount: "+total);
		System.out.println("We used this many numbers in array: "+numberUsed);


	}

}

