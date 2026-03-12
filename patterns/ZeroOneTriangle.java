import java.util.*;

public class ZeroOneTriangle{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the no. of rows: ");
        int n = scanner.nextInt();
        System.out.println("Enter the no. of coloums: ");
        int m = scanner.nextInt();

// 0-1 Triangle
        for(int i=1; i<=n; i++){
        for( int j=1; j<=i; j++){
        int sum = i+j ;
        if(sum%2==0){
        System.out.print("1 ");
        }else{
        System.out.print("0 ");
        }
        }
        System.out.println();
        }
    }
}