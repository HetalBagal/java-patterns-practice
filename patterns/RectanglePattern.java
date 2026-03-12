import java.util.*;

public class RectanglePattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the no. of rows: ");
        int n = scanner.nextInt();
        System.out.println("Enter the no. of coloums: ");
        int m = scanner.nextInt();

        // for Rectangle Pattern
        for (int i = 1; i <= n; i++) {
        for (int j = 0; j <= m; j++) {
        System.out.print("* ");
        }
        System.out.println();
        }
    }
}