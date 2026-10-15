
import java.util.Scanner;

public class Simple_Interest {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Simple Interest \n ");

        System.out.print("Tell me your Principal Amount Rs : ");
        int Principal = sc.nextInt();

        System.out.print("Tell me your rate of Interest : ");
        float rate = sc.nextFloat();

        System.out.print("Tell me for how many year : ");
        float year = sc.nextFloat();

        double Interest = (Principal*rate*year)/100;
        System.out.println("\n\n Your Simple Interest is RS : " + Interest);
    }

}
