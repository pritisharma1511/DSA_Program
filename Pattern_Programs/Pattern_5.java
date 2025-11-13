public class Pattern_5 {
    public static void main(String[] args) {
        int rows = 5;

        // Outer loop for rows
        for (int i = 1; i <= rows; i++) {
            // Inner loop for columns
            for (int j = i; j <= rows; j++) {
                System.out.print(j);
            }
            // Move to the next line
            System.out.println();
        }
    }
}