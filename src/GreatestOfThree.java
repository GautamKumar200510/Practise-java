
import java.util.Scanner;

public class GreatestOfThree {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter your Number ");

        System.out.print("Enter the First No : ");
        int a = sc.nextInt();

        System.out.print("Enter the Second No : ");
        int b = sc.nextInt();

        System.out.print("Enter the Third No : ");
        int c = sc.nextInt();

        if (a>=b && a>=c) {
            System.out.println("Greatest no is : " + a);
            
        } 

        else if (b>=a && b>=c){
            System.out.println("Greatest no is : " + b);
        }
        else{
            System.out.println("Greatest No is : " + c);
        }

    }

}
