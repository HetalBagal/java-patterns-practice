import java.util.*;

public class SolidRhombus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the no. of rows: ");
        int n = scanner.nextInt();
        System.out.println("Enter the no. of coloums: ");
        int m = scanner.nextInt();

        // Solid Rhombus
        for (int i = 1; i <= n; i++) {
        // Spaces
        for (int j = 1; j <=n - i; j++) {
        System.out.print(" ");
        }
        // stars
        for (int j = 1; j <= n; j++) {
        System.out.print("* ");
        }
        System.out.println();
        }
    }
}