/*
A B C D 
A B C D 
A B C D 
 */
class program7 {
    public static void main(String[] args) {
     

        for (int i = 0; i < 3; i++) {
            for (char ch = 'A'; ch <= 'D'; ch++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
}
