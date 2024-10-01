/*Program 2: Write a Program to Print following Pattern
1
2 3
4 5 6
7 8 9 10

*/

class Program2{
	public static void main(String[]args){
		int num=0;
		for(int i=1;i<=4;i++){
			for(int j=1;j<=i;j++){
				num++;
				System.out.print(num + " ");
			}		
		System.out.println();				
		}

	}
}