/*
Program 2: Write a Program which accepts two integers from user and swaps
their insertion order.
Input : 20 30
Output :
Before Swap : 20 30
After Swap : 30 20
*/


import java.util.Scanner;

class demo2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num1 : ");
		int num1 = sc.nextInt();
		System.out.println("Enter num2 : ");
		int num2 = sc.nextInt();
		
		System.out.println("Before Swap" + num1 + " " + num2);
		
		num1 = num1 + num2;
		num2 = num1 - num2;
		num1 = num1 - num2;
	
		System.out.println("After Swap" + num1 + " " + num2);
	
	}
}
