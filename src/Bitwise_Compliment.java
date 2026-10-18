
import java.util.Scanner;

public class Bitwise_Compliment {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Shows The Bitwise Compliment  Number : \n ");

        System.out.print("Please Enter your number : ");
        int num = sc.nextInt();

        int result = ~num;
        System.out.println("Result is : " + result);

    }

}
