import java.util.*;

// *******
//  *   *
//   * *
//    *
//   ***
//  *****
// *******

public class pattern18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an odd number = ");
        int n = sc.nextInt();
        sc.close();
        
        System.out.println();
        int sp = 0;
        int st = n;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= sp; j++) {
                System.out.print(" ");
            }
            for(int k = 1; k <= st; k++) {
                if(i > 1 && i <= n/2 && k > 1 && k < st) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
                
            }
            if(i <= n/2) {
                sp++;
                st -= 2;
            } else {
                sp--;
                st += 2;
            }
            System.out.println();
        }
    }
}
