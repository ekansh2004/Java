import java.util.Scanner;
import java.util.Stack;

public class smallestNumFollowingPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter order = ");
        String str = sc.next();
        sc.close();

        Stack<Integer> st = new Stack<>();
        int num = 1;

        System.out.println();
        System.out.print("Number is = ");

        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(ch == 'd'){
                st.push(num);
                num++;
            } else {
                st.push(num);
                num++;
                while(st.size() > 0){
                    System.out.print(st.pop());
                }
            }
        }
        st.push(num);
        while (st.size() > 0) {
            System.out.print(st.pop());
        }
    }
}