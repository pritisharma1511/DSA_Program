public class Pattern_6 {
    public static void main(String[] args) {
        int rows = 5;

        // Outer loop for rows
        for (int i = 1; i <= rows; i++) {
            // Inner loop for columns
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            // Move to the next line
            System.out.println();
        }
    }
}