// Program2 . Write a java program to print following pattern
/*
1 
1 2 
1 2 3 
1 2 3 4 
 */
class a2{
    public static void main(String[] args) {
        for (int i = 0; i <= 3; i++) {
            for (int j = 1; j <= i+1; j++) {
                System.out.print(j+" ");
            }   
            System.out.println();
        
    }
}
}

