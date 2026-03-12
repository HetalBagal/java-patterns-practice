import java.util.*;

public class NumberPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the no. of rows: ");
        int n = scanner.nextInt();
        System.out.println("Enter the no. of coloums: ");
        int m = scanner.nextInt();

 // Number Pyramid
        for (int i = 1; i <= n; i++) {
        // spaces
        for (int j = 1; j <= n - i; j++) {
        System.out.print(" ");
        }
        // numbers- >print row no, row no times
        for (int j = 1; j <= i; j++) {
        System.out.print(i + " ");
        }
        System.out.println();
        }
    }}
