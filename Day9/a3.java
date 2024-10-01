// Program3 . Write a java program to print following pattern
/*
A B C D 
A B C 
A B 
A 
 */
class a3{
    public static void main(String[] args) {
        for (int i = 0; i <= 3; i++) {
            char ch = 'A';
            for (int j = 0; j <= 3 ; j++) {
               
                if(j< 4 - i){
                    System.out.print(ch+" ");
                    ch++;
                }
            }   
            System.out.println();
        
    }
}
}

