import java.util.*;

// 1     1
// 12   21
// 123 321
// 1234321

public class pattern16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number = ");
        int n = sc.nextInt();
        sc.close();
        
        System.out.println();
        int sp = (2 * n) - 3;
        int st = 1;
        
        for(int i = 1; i <= n; i++){
            int v = 1;
            for(int f = 1; f <= st; f++) {
                System.out.print(v);
                v++;
            }
            for(int j = 1; j <= sp; j++) {
                System.out.print(" ");
            }
            if(i == n) {
                st--;
                v--;
            }
            for(int k = 1; k <= st; k++) {
                v--;
                System.out.print(v);
            }
            st++;
            sp -= 2;
            System.out.println();
        }
    }
}
