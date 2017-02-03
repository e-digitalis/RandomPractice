/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package randompractice;

import java.util.Random;

public class RandomNumberGenerator {

	public static int createRandomNumber(){
	
		
		Random createRandomOperation = new Random();
		int rVToGuess = createRandomOperation.nextInt(10);		//creating random number up to value in parentheses
		System.out.println(rVToGuess);							//just checking that the number generator works
		return rVToGuess;
			
	}

	public RandomNumberGenerator() {
		
	}
	
	
	
}
