import java.util.*;

/*
    Given an array and an integer K, find the maximum for each 
    and every contiguous subarray of size K.
*/

public class slidingWindowMaximum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number of elements = ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            System.out.print("Enter element at index " + i + " = ");
            arr[i] = sc.nextInt();
        }
        System.out.println();
        System.out.print("Enter size of window = ");
        int x = sc.nextInt();
        sc.close();

        Stack<Integer> st = new Stack<>();
        int[] nge = new int[arr.length];

        st.push(arr.length - 1);
        nge[arr.length - 1] = arr.length;

        for(int i = arr.length - 2; i >= 0; i--){
            while(st.size() > 0 && arr[i] >= arr[st.peek()]){
                st.pop();
            }
            if(st.size() == 0){
                nge[i] = arr.length;
            } else {
                nge[i] = st.peek();
            }
            st.push(i);
        }
        int j = 0;
        for(int i = 0; i <= arr.length - x; i++){
            if(j < i){
                j = i;
            }
            while(nge[j] < i + x){
                j = nge[j];
            }

            System.out.println(arr[j]);
        }
    }
}
