import java.util.*;

//   *
//  * *
// *   *
//  * *
//   *

public class pattern10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number = ");
        int n = sc.nextInt();
        sc.close();
        
        System.out.println();
        int osp = n/2;
        int isp = -1;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= osp; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            for(int k = 1; k <= isp; k++) {
                System.out.print(" ");
            }
            if(i > 1 && i < n){
                System.out.print("*");
            }
            if(i <= n/2) {
                osp--;
                isp += 2;
            } else {
                osp++;
                isp -= 2;
            }
            System.out.println();
        }
    }
}
