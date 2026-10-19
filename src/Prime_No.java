
import java.util.Scanner;

public class Prime_No {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the Number : ");
        int n = sc.nextInt();

        int num = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i==0) {
                num++;
                
            }
        }

        if (num==2) {
            System.out.println("Prime Number");
        }else{
            System.out.println("Not Prime");
        }
       

    }

}
