
/*Program 3: Write a Program to print Cubes and Squares of all Even numbers
ranges between given input number.
Input: 10
Output:
Cube of 2 : 8 and Square of 2 : 4
Cube of 4 : 64 and Square of 4 : 16 */

import java.util.Scanner;

class demo4{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num1 : ");
		int num1 = sc.nextInt();
		System.out.println("Enter num2 : ");
		int num2 = sc.nextInt();
		for(int i = num1; i <= num2; i++) {
			System.out.print(i % 2 == 0 ? "\n\nSqr of " + i +  " : " + i * i + "\nCube of " + i + " : " + i * i * i : "");
		}
	}
}
