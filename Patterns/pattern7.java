import java.util.*;

// *
//  *
//   *
//    *
//     *

public class pattern7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number = ");
        int n = sc.nextInt();
        sc.close();

        System.out.println();
        int sp = 0;
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= sp; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println();
            sp++;
            
        }
    }
}
