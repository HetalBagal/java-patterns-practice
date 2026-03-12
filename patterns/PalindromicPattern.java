import java.util.*;

public class PalindromicPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the no. of rows: ");
        int n = scanner.nextInt();
        System.out.println("Enter the no. of coloums: ");
        int m = scanner.nextInt();
// Palindromic Pattern
        for (int i = 1; i <= n; i++) {
        // spaces
        for (int j = 1; j <= n - i; j++) {
        System.out.print(" ");
        }
        // First half numbers
        for (int j = i; j >= 1; j--) {
        System.out.print(j);
        }
        // second half numbers
        for (int j = 2; j <= i; j++) {
        System.out.print(j);
        }
        System.out.println();
        }
    }
}