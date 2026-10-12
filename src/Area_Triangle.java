
import java.util.Scanner;

public class Area_Triangle {
    public static void main(String[] args) {
        

        Scanner sc = new Scanner(System.in);
        System.out.println("Calculate the Area of Triangle : ");

        System.out.print("Enter the base : ");
        double b = sc.nextDouble();

        System.out.print("Enter the Height : ");
        double h = sc.nextDouble();

        double area = b*h/2;

        System.out.println("Area of Traingle is : " + area);

    }

}
