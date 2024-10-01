/*
 * program3. Write java program to print pattern
 
* * * * 
* * * 
* * 
* 

 */

class p3{
    public static void main(String[] args) {
         for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4 ; j++) {
                if (j<4-i) {     
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}

