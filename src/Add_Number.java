
import java.util.Scanner;

public class Add_Number {

    public static void main(String[] args) {

        System.out.print("Print The Two Number : ");
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        System.out.println("Enter 1St num : " + a);

        int b = sc.nextInt();
        System.out.println("Enter 2nd num : " + b);

        int sum = a + b;
        System.out.println("Sum of Two No Is : " + sum);

    }

}
