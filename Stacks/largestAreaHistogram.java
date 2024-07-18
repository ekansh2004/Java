import java.util.Scanner;
import java.util.Stack;

/*
    Find the largest rectangular area possible in a given histogram where 
    the largest rectangle can be made of a number of contiguous bars whose 
    heights are given in an array. For simplicity, assume that all bars have 
    the same width and the width is 1 unit. 
*/

public class largestAreaHistogram {
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

        int[] rb = new int[arr.length]; // nse on right
        Stack<Integer> st = new Stack<>();
        st.push(arr.length - 1);
        rb[arr.length - 1] = arr.length;
        for(int i = arr.length - 2; i >= 0; i--){
            while(st.size() > 0 && arr[i] <= arr[st.peek()]){
                st.pop();
            }
            if(st.size() == 0){
                rb[i] = arr.length;
            } else {
                rb[i] = st.peek();
            }
            st.push(i);
        }

        int[] lb = new int[arr.length]; // nse on left
        st = new Stack<>();
        st.push(0);
        lb[0] = -1;
        for(int i = 1; i < arr.length; i++){
            while(st.size() > 0 && arr[i] <= arr[st.peek()]){
                st.pop();
            }
            if(st.size() == 0){
                lb[i] = -1;
            } else {
                lb[i] = st.peek();
            }
            st.push(i);
        }

        int maxA = 0;
        for(int i = 0; i < arr.length; i++){
            int width = rb[i] - lb[i] - 1;
            int area = arr[i] * width;
            if(area > maxA){
                maxA = area;
            }
        }
        System.out.println("The largest area in the histogram is = " + maxA);
    }
}
