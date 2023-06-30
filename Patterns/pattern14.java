import java.util.*;

// let input = 2
// 2 * 1 = 2
// 2 * 2 = 4
// 2 * 3 = 6
// ......
// 2 * 10 = 20

public class pattern14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number = ");
        int n = sc.nextInt();
        sc.close();
        
        System.out.println();
        int r;
        for(int i = 1; i <= 10; i++){
            r = n * i;
            System.out.println(n + " * " + i + " = " + r);
        }
    }
}
