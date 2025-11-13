public class Pattern_7 {
    public static void main(String[] args) {
        int rows = 5;

        // Outer loop (must decrement i)
        for (int i = rows; i >= 1; i--) {  // 👈 Notice i--
            // Inner loop prints 'i' times
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            // Move to the next line
            System.out.println();
        }
    }
}
