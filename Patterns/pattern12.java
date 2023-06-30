import java.util.*;

// 0
// 1 1
// 2 3 5
// 8 13 21 34

public class pattern12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number = ");
        int n = sc.nextInt();
        sc.close();
        
        System.out.println();
        int a = 0;
        int b = 1;
        int c;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++) {
                System.out.print(a + " ");
                c = a + b;
                a = b;
                b = c;
            }
            System.out.println();
        }
    }
}
