import java.util.*;

// First of all you will get a number n, which indicates the length of an array. 
// Then you will get n more inputs corresponding to each index of the array.
//
// And you are required to find the span of the array, which is defined as the 
// difference between max and min value of the array.

public class array_Span {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements = ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            System.out.print("Enter element " + i + " = ");
            arr[i] = sc.nextInt();
        }
        sc.close();

        int min = arr[0];
        int max = arr[0];

        for(int i = 0; i < n; i++) {
            if(arr[i] < min) {
                min = arr[i];
            }
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        int r = max - min;

        System.out.println();
        System.out.println("Span of the array is = " + r);
    }
}
