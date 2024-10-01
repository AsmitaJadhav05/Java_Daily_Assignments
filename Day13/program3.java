/*Program 3: Write a Program to Print following Pattern
*
* *
* * *
* * * *

*/

class Program3{
	public static void main(String[]args){
		int num=0;
		for(int i=1;i<=4;i++){
			for(int j=1;j<=i;j++){
				num++;
				System.out.print("*" + " ");
			}		
		System.out.println();				
		}

	}
}