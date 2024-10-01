/*

   Program 5: Write a Program to print following Pattern.

   Output:
		*
		* * 
		* * * 
		* * * * 
*/

import java.util.*;

class aj1 {

	public static void main(String[] args){
	
		Scanner sc  = new Scanner(System.in);

		System.out.print("Enter Row: ");
		int row = sc.nextInt();

		for(int olc = 0;olc < row;olc++) {
		
			for(int ilc = 0;ilc <= olc;ilc++) {
			
				System.out.print(" * ");
			}
			System.out.println();
		}
	}
}
