import java.util.*;

public class array_Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number of elements in array 1 = ");
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        for(int i = 0; i < n1; i++) {
            System.out.print("Enter digit of number(0-9) = ");
            arr1[i] = sc.nextInt();
        }
        System.out.print("Enter a number of elements in array 2 = ");
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        for(int i = 0; i < n2; i++) {
            System.out.print("Enter digit of number(0-9) = ");
            arr2[i] = sc.nextInt();
        }
        sc.close();

        // if(n1 > n2) {
        //     int[] sum = new int[n1];
        // } else {
        //     int[] sum = new int[n2];
        // }
        int[] sum = new int[n1 > n2? n1:n2]; // Same code is written but using ternary operator
        int c = 0;
        int i = arr1.length - 1;
        int j = arr2.length - 1;
        int k = sum.length - 1;

        while(k >= 0) {
            int d = c;
            if(i >= 0){
                d += arr1[i];
            }
            if(j >= 0) {
                d += arr2[j];
            }
            c = d/10;
            d = d%10;
            sum[k] = d;

            i--;
            j--;
            k--;
        }

        System.out.println();
        System.out.print("The answer is = ");
        if(c != 0){
            System.out.print(c);
        }
        for(int v: sum) {
            System.out.print(v);
        }
    }
}
