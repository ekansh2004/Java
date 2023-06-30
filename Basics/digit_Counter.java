import java.util.*;

public class digit_Counter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number = ");
        int n = sc.nextInt();
        sc.close();

        int c = 0;

        while(n != 0) {
            n = n / 10;
            c++;
        }
        System.out.println("The number of digits in the number is => " + c);
    }
}