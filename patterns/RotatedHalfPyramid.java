import java.util.*;

public class RotatedHalfPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the no. of rows: ");
        int n = scanner.nextInt();
        System.out.println("Enter the no. of coloums: ");
        int m = scanner.nextInt();


 // Inverted Half Pyramid(rotated by 180 deg)
        for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= (n - i); j++) {
        System.out.print(" ");
        }
        for (int j = 1; j <= i; j++) {
        System.out.print("*");
        }
        System.out.println();
        }
    }
}