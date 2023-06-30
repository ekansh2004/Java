import java.util.*;

//   1
//  232
// 34543
//  232
//   1

public class pattern15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number = ");
        int n = sc.nextInt();
        sc.close();
        
        System.out.println();
        int sp = n/2;
        int st = 1;
        int v = 1;
        int cv;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= sp; j++) {
                System.out.print(" ");
            }
            cv = v;
            for(int k = 1; k <= st; k++) {
                System.out.print(cv);
                if(k <= st/2) {
                    cv++;
                } else {
                    cv--;
                }
            }
            if(i <= n/2) {
                sp--;
                st += 2;
                v++;
            } else {
                sp++;
                st -= 2;
                v--;
            }
            System.out.println();
        }
    }
}
