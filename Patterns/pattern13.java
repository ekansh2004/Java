import java.util.*;

// 1
// 1 1
// 1 2 1
// 1 3 3 1
// 1 4 6 4 1
// 1 5 10 10 5 1

public class pattern13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number = ");
        int n = sc.nextInt();
        sc.close();
        
        System.out.println();
        int icj;
        int icjp1;
        for(int i = 0; i < n; i++){
            icj = 1;
            for(int j = 0; j <= i; j++) {
                System.out.print(icj + " ");
                icjp1 = (icj * (i - j)) / (j + 1);
                icj = icjp1;
            }
            System.out.println();
        }
    }
}
