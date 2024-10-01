// Program1 . Write a java program to print following pattern
/*
7 
7 6 
7 6 5 
7 6 5 4 
 */
class a1{
    public static void main(String[] args) {
        for (int i = 0; i <= 3; i++) {
            int num = 7;
            for (int j = 0; j <= i; j++) {
                System.out.print(num+" ");
                num--;
            }
            System.out.println();
        }
    }
}

