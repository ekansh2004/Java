import java.util.*;

/*
    The Next greater Element for an element x is the first greater element on the 
    right side of x in the array. Elements for which no greater element exist, 
    consider the next greater element as -1. 
*/

public class nextGreatestElementToRight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number of Elements = ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] nge = new int[n];
        for(int i = 0; i < n; i++) {
            System.out.print("Enter element at index " + i + " = ");
            arr[i] = sc.nextInt();
        }
        sc.close();

        Stack<Integer> st = new Stack<>();

        st.push(arr[arr.length - 1]);
        nge[arr.length - 1] = -1;
        for(int i = arr.length - 2; i >= 0; i--){
            //-a+
            while(st.size() > 0 && arr[i] >= st.peek()){
                st.pop();
            }
            if(st.size() == 0){
                nge[i] = -1;
            } else{
                nge[i] = st.peek();
            }
            st.push(arr[i]);
        }

        System.out.println();
        System.out.print("The Next Greatest Element to the right is = ");
        for(int i = 0; i < nge.length; i++){
            System.out.print(nge[i] + " ");
        }
        System.out.println();
    }
}
