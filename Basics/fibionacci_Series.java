import java.util.*;

public class fibionacci_Series {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number = ");
        int n = sc.nextInt();
        sc.close();

        int a = 0;
        int b = 1;
        int c;

        System.out.println("Fibionacci series upto " + n + " is =>");

        for(int i = 0; i < n; i++) {
            System.out.print(a + " ");
            c = a + b;
            a = b;
            b = c;
        }
    }
}
