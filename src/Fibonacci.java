
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");

        int n = sc.nextInt();

        long first = 0;
        long second = 1;
        for (int i = 0; i < n; i++) {
            System.out.println(first + " ");

        long next = first +second;
        first = second;
        second = next;
            
        }
    }

}
