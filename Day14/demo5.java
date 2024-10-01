/* Program 5: Write a Program that accepts Two integers from user and prints
maximum number from them.
Input: 56 99
Output: The Maximum number amongst 56 & 99 is 99 */


import java.util.Scanner;

class  demo5{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num1 : ");
		int num1 = sc.nextInt();
		System.out.println("Enter num2 : ");
		int num2 = sc.nextInt();
		System.out.print(num1 > num2 ? "Max : " + num1 : num1 == num2 ? "Equal" : "Max : " + num2);
	}
}
