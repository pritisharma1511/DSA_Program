public class Pattern_8{
    public static void main(String[] args) {
        int rows = 5;

        // Outer loop (must decrement i)
        for (int i = 1; i <= 5; i++) {
    for (int space = i; space < 5; space++) {
        System.out.print(" ");
    }
    for (int j = 1; j <= i; j++) {
        System.out.print(j);
    }
    System.out.println();
}
    }
}