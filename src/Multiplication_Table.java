
import java.util.Scanner;

public class Multiplication_Table {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Multiplication Table :");

        System.out.print("Please Enter your Number : ");
        int num = sc.nextInt();

        for (int i = 1; i <= 10; i++) {

            System.out.println(num + " x " + i + " = "  + (num * i)); 




            

        }
    }

}
