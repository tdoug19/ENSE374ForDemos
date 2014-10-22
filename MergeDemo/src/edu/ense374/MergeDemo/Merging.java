/**
 * Merging.java version 1.0  Oct 21, 2014
 *
 * Trevor Douglas
 * 
 */
 
package edu.ense374.MergeDemo;

/**
 * @author tdouglas
 *
 */
public class Merging {

	
	int Factorial(int factorial)
	{
		//I have to initialize the factorial to 1
		int result = 1;
	    for	(int i = 1; i <= factorial; i++) {
	           result = result * i;
	    }
		
	    return result;
		
	}
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {

			Merging merge = new Merging();
			int result = merge.Factorial(5);
			System.out.println("Factorial is: " + result); 
    }
	
	



}
