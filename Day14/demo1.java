/*Program 1: Write a Program to print series of odd numbers ranging between
two numbers entered by user.
Input:
Min of Series : 4
Max of Series: 60
Output: Series Of Odd Numbers Ranging between 4 & 60 is:
5, 7, 9, . . ., 59*/


import java.util.Scanner;

class demo1{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num1 : ");
		int num1 = sc.nextInt();
		System.out.println("Enter num2 : ");
		int num2 = sc.nextInt();
		for(int i = num1; i <= num2; i++) {
			System.out.print(i % 2 == 1 ? i + " " : "");
		}
	}
}
