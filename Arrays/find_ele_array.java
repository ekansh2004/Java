import java.util.*;

// first of all you will get a number n, which indicates the length of an array. 
// Then you will get n more inputs corresponding to each index of the array.
// After that you will be given one more input, d as data, for which you have 
// to find,at which index of array d is present. And in case d is not present 
// in the array then you need to print -1.

public class find_ele_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number = ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            System.out.print("Enter element at index " + i + " = ");
            arr[i] = sc.nextInt();
        }
        System.out.println();
        System.out.print("Enter element to find = ");
        int e = sc.nextInt();
        sc.close();

        int index = -1;
        for(int i = 0; i < n; i++) {
            if(arr[i] == e) {
                index = i;
            }
        }
        System.out.println("The element was found at index = " + index);
    }
}