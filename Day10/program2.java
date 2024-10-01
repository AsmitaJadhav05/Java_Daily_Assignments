/*Program2 : Write a java program to print pattern.
4 4 4 4
  3 3 3
    2 2
      1

*/

class program2{
	public static void main(String[]args){
		int num=5;
		for(int i=1;i<=4;i++){
			num--;
			for(int j=1;j<=4;j++){
				if(i<=j){				
					System.out.print(num+" ");
				}else{
					System.out.print("  ");
				}
			}		
		System.out.println();				
		}

	}
}