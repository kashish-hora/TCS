import java.util.*;

public class Password {
    public static void main(String args[]) {
        System.out.println("Enter the String");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        // Calculate dimensions for the 2D array
        int L = str.length();
        int row = (int) Math.floor(Math.sqrt(L));
        int col = (int) Math.ceil(Math.sqrt(L));

        // Create a 2D array with the calculated dimensions
        char arr[][] = new char[row][col];

        // Fill the 2D array with characters from the input string
        int index = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col && index < L; j++) {
                arr[i][j] = str.charAt(index);
                index++;
            }
        }

        // Print the 2D array
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(); // Move to the next line after printing each row
        }

        // Print each column separately
        for (int j = 0; j < col; j++) {
            for (int i = 0; i < row; i++) {
                if (arr[i][j] != '\0') {  // Check if the character is not null
                    System.out.print(arr[i][j]);
                }
            }
            System.out.print(" ");  // Separate columns by space
        }
    }
}
