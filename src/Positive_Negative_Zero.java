
import java.util.Scanner;

public class Positive_Negative_Zero {
    public static void main (String[] args){

        Scanner sc = new Scanner (System.in);
        System.out.print("Please Enter your Number : ");

        int num = sc.nextInt();

        if (num>0) {
            System.out.println("Your Number is positive");
            
        }
        else if (num==0){
            System.out.println("Your number is zero  ");
        }

        else{
            System.out.println("Your number is negative");
        }
    }

}
