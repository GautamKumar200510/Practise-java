
import java.util.Scanner;

public class Bitwise_OR {
    public static void main(String[] args) {
        
      Scanner sc = new Scanner(System.in);
        System.out.print("Shows Bitwise AND Operator : \n ");

        System.out.print("Enter Your First Number : ");
        int first = sc.nextInt();

        System.out.print("Enter Your Second Number : ");
        int Second = sc.nextInt();

        int result = first & Second;
        System.out.println("Result is : " + result);
    }

}
