import java.util.Scanner;
import java.util.Stack;

public class celebrityProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number = ");
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++){
                System.out.print("Enter element at (" + i + "," + j + ") = ");
                arr[i][j] = sc.nextInt();
            }
        }
        sc.close();

        Stack<Integer> st = new Stack<>();
        for(int i = 0; i < arr.length; i++){
            st.push(i);
        }

        while(st.size() >= 2){
            int i = st.pop();
            int j = st.pop();

            if(arr[i][j] == 1){
                //if i knows j -> i is not a celebrity
                st.push(j);
            } else {
                //if i does not know j -> j is not a celbrity
                st.push(i);
            }
        }
        int pot = st.pop();
        for(int i = 0; i < arr.length; i++){
            if(i != pot){
                if(arr[i][pot] == 0 || arr[pot][i] == 1){
                    System.out.println("None");
                    return;
                }
            }
        }
        System.out.println(pot);
    }
}
