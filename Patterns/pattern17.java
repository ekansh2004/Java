import java.util.*;

//   *
//   **
// *****
//   **
//   *
// Arrow

public class pattern17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an odd number = ");
        int n = sc.nextInt();
        sc.close();
        
        System.out.println();
        int sp = n/2;
        int st = 1;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= sp; j++) {
                if(i == (n/2) + 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                } 
                
            }
            for(int k = 1; k <= st; k++) {
                System.out.print("*");
            }
            if(i <= n/2) {
                st++;
            } else {
                st--;
            }
            System.out.println();
        }
    }
}
