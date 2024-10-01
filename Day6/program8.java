/*
 * Program8: write java program to print following pattern
1 3 5 7
9 11 13 15
17 19 21 23
 */

class program8 {
    public static void main(String[] args) {
        int rows = 3; // Number of rows
        int columns = 4; // Number of columns
        int startNum = 1; // Starting number

        for (int i = 0; i < rows; i++) {
            int currentNum = startNum;
            for (int j = 0; j < columns; j++) {
                System.out.print(currentNum + " ");
                currentNum += 2;
            }
            System.out.println();
            startNum += 2; // Increment the starting number for the next row
        }
    }
}
