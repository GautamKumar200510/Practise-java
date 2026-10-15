
import java.util.Scanner;

public class Compound_Interest {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Compound Interest ");

         System.out.print("Tell me your Principal Amount Rs : ");
        int Principal = sc.nextInt();

        System.out.print("Tell me your rate of Interest : ");
        float rate = sc.nextFloat();

        System.out.print("Tell me for how many year : ");
        float year = sc.nextFloat();

        double Compound_Interest = Principal*Math.pow((1+rate/100), year);
        System.out.println("Your Compound Interest is RS : " + Compound_Interest);
    }

}
