import java.util.*;

public class Pattern_1 {
    public static void main(String[] args) {
        // Number of rows and columns
        int rows = 5;
        int cols = 5;

        // Outer loop for rows
        for (int i = 1; i <= rows; i++) {
            // Inner loop for columns
            for (int j = 1; j <= cols; j++) {
                System.out.print("*");
            }
            // Move to the next line
            System.out.println();
        }
    }
}
