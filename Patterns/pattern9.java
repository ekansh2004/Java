import java.util.*;

// *   *
//  * *
//   *
//  * *
// *   *

public class pattern9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number = ");
        int n = sc.nextInt();
        sc.close();

        System.out.println();
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++) {
                if(i == j || i + j == n - 2){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
