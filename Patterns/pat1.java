import java.util.*;

// *
// **
// ***
// ****
// *****

public class pat1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of stars = ");
        int n = sc.nextInt();
        sc.close();

        System.out.println();
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
