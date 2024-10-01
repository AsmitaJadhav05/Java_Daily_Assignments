/*Program 4: Write a java program to calculate the factorial
of a given number.
Input: 5
Output:
The Factorial of 5 is: 120

*/
import java.util.*;

class Program4{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Input any number of find it's factorial");
		int num=sc.nextInt();
		int fact=1;
		for(int i=1;i<=num;i++){
			fact=fact*i;	
		}
		System.out.println("The Factorial of" + num + " " + "is:" + " " + fact);			

	}
}