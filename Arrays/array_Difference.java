import java.util.*;

public class array_Difference {
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

        int[] dif  = new int[n2];
        int c = 0;
        int i = arr1.length - 1;
        int j = arr2.length - 1;
        int k = dif.length - 1;
        while(k >= 0) {
            int d = 0;
            int arr1v = i >=0? arr1[i]: 0;
            if(arr2[j] + c >= arr1v) {
                d = (arr2[j] + c) - arr1v;
                c = 0;
            } else {
                d = (arr2[j] + c + 10) - arr1v;
                c = -1;
            }
            dif[k] = d;

            i--;
            j--;
            k--;
        }

        int index = 0;
        while(index <= dif.length) {
            if(dif[index] == 0) {
                index++;
            } else {
                break;
            }
        }
        System.out.println();
        System.out.print("The answer is = ");
        while(index < dif.length) {
            System.out.print(dif[index]);
            index++;
        }
        System.out.println();
    }
}
