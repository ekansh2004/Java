import java.util.Scanner;

public class Finally {
    public static int div(int x, int y) {
        try {
            int r = x/y;
            return r;
        }
        catch(Exception e) {
            System.out.println(e);
        }
        finally {
            System.out.println("Finally block executed");
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number a = ");
        int a = sc.nextInt();
        System.out.print("Enter number b = ");
        int b = sc.nextInt();
        sc.close();

        int r = div(a,b);
        if(r == -1) {
            return;
        }
        System.out.println(r);
    }
}
