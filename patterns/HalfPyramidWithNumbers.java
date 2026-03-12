import java.util.*;

public class HalfPyramidWithNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the no. of rows: ");
        int n = scanner.nextInt();
        System.out.println("Enter the no. of coloums: ");
        int m = scanner.nextInt();

        // Half Pyramid With Numbers
        for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= i; j++) {
        System.out.print(j+" ");
        }
        System.out.println();
        }
    }
}
