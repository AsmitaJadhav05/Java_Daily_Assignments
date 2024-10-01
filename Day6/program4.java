
/*
 * Program4 : Write a java program to print pattern :
    A  B  C  D
    E  F  G  H
    I  J  K  L
 */
class program4 {
    public static void main(String[] args) {
     char ch = 'A';
     for (int i = 0; i < 3; i++) {
         for (int j = 0; j < 4; j++) {
             System.out.print(ch+"  ");
             ch++;
         }
         System.out.println();
     }
    } 
 }
 