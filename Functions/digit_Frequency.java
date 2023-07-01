import java.util.*;

public class digit_Frequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number = ");
        int n = sc.nextInt();
        System.out.println();
        System.out.print("Enter a digit = ");
        int x = sc.nextInt();
        int r = df(n, x);
        sc.close();
        System.out.println("The number of times the digit appears in the number is = " + r);
    }
    
    public static int df(int num, int d) {
        int c = 0;
        while(num > 0) {
            int dt = num % 10;
            if(dt == d) {
                c++;
            }
            num /= 10;
        }

        return c;
    }
}