import java.util.*;

//     *
//    **
//   ***
//  ****
// *****

public class pattern3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number = ");
        int n = sc.nextInt();
        sc.close();

        int sp = n-1;
        int st = 1;

        System.out.println();
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= sp; j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= st; j++) {
                System.out.print("*");
            }
            sp--;
            st++;
            System.out.println();
        }
    }
}
