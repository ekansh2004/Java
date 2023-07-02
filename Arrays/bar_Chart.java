import java.util.*;

public class bar_Chart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number = ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            System.out.print("Enter element at index " + i + " = ");
            arr[i] = sc.nextInt();
        }
        sc.close();

        int max = arr[0];
        for(int i = 0; i < n; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println();
        for(int f = max; f >= 1; f--) {
            for(int i = 0; i < n; i++) {
                if(arr[i] >= f) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
