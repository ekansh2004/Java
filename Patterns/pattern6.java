import java.util.*;

// *** ***
// **   **
// *     *
// **   **
// *** ***

public class pattern6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number = ");
        int n = sc.nextInt();
        sc.close();

        System.out.println();
        int st = (n/2) + 1;
        int sp = 1;
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= st; j++) {
                System.out.print("*");
            }
            for(int k = 1; k <= sp; k++) {
                System.out.print(" ");
            }
            for(int l = 1; l <= st; l++) {
                System.out.print("*");
            }
            if(i <= n/2) {
                st--;
                sp += 2;
            }
            else {
                st++;
                sp -= 2;
            }
            System.out.println();
        }
    }
}
