
import java.util.Scanner;

public class Odd_Even {
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter your Number : ");

        int num = sc.nextInt();

        if (num%2==0) {
            System.out.println("Your Number is Even");
    }
    else{
        System.out.println("Your Number is Odd");
    }

}

}
