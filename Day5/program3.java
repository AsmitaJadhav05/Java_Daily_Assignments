/*Program 3: Determine if a Character is a Vowel or Consonant */

class program3{
    public static void main(String[] args) {
        char ch = 'a'; // Change this value to test with different inputs

        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || 
           ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
            System.out.println(ch + " is a vowel");
        } else {
            System.out.println(ch + " is a consonant");
        }
    }
}
