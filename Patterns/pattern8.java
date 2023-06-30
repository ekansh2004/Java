import java.util.Scanner;

public class pattern8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number = ");
        int n = sc.nextInt();
        sc.close();

        System.out.println();
        int sp = n-1;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= sp; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println();
            sp--;
        }
    }
}
