import java.util.*;

public class InvertedHalfPyramidWithNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the no. of rows: ");
        int n = scanner.nextInt();
        System.out.println("Enter the no. of coloums: ");
        int m = scanner.nextInt();

// Half Inverted Pyramid With Numbers
        for (int i = n; i >= 1; i--) {
        for (int j = 1; j <= i; j++) {
        System.out.print(j+" ");
        }
        System.out.println();
        }
    }
}