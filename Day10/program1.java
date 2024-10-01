/*Program1 : Write a java program to print pattern.

7
7 6
6 5 4
4 3 2 1

*/

class program1{
	public static void main(String[]args){
		int num=7;
		for(int i=1;i<=4;i++){
			for(int j=1;j<=i;j++){
				if(j>1){
					num--;
				}
				System.out.print(num + " ");
			}		
		System.out.println();				
		}

	}
}