import java.util.*;

public class number_Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number = ");
        int n = sc.nextInt();
        sc.close();

        System.out.println("Reverse of the number is =>");
        int t;
        while(n != 0) {
            t = n % 10;
            System.out.print(t);
            n = n / 10;
        }
    }
}
