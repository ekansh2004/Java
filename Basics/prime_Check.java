import java.util.*;

public class prime_Check {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number = ");
        int n = sc.nextInt();
        sc.close();

        if(n == 1) {
            System.out.println("Number is neither prime nor composite");
        }
        int p = 1;

        for(int i = 2; i < n; i++) {
            if(n % i == 0) {
                p = 0;
                break;
            }
        }

        if(p == 1) {
            System.out.println("Number is prime");
        }
        else {
            System.out.println("Number is composite");
        }
    }
}
