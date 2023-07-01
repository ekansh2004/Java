import java.util.*;

public class nPr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n = ");
        int n = sc.nextInt();
        System.out.print("Enter r = ");
        int r = sc.nextInt();
        sc.close();

        int nf = fact(n);
        int nmrf = fact(n-r);

        int res = nf / nmrf;

        System.out.println(n + "P" + r + " = " + res);
    }
    public static int fact(int x) {
        int xf = 1;
        for(int i = 1; i <= x; i++) {
            xf = xf * i;
        }

        return xf;
    }
}
