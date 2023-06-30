import java.util.*;

// *****
//  ****
//   ***
//    **
//     *

public class pattern4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number = ");
        int n = sc.nextInt();
        sc.close();

        int sp = 0;
        int st = n;
        System.out.println();
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= sp; j++) {
                System.out.print(" ");
            }
            for(int k = 1; k <= st; k++) {
                System.out.print("*");
            }
            sp++;
            st--;
            System.out.println();
        }
    }
}
