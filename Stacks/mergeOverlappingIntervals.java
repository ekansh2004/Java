import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class mergeOverlappingIntervals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number = ");
        int n = sc.nextInt();
        sc.nextLine();
        int[][] arr = new int[n][2];
        for(int i = 0; i < n; i++) {
            System.out.print("Enter the start and end times with a space = ");
            String line = sc.nextLine(); 
            String[] parts = line.split(" ");
            arr[i][0] = Integer.parseInt(parts[0]);
            arr[i][1] = Integer.parseInt(parts[1]);
        }
        sc.close();

        Pair[] pairs = new Pair[arr.length];
        for (int i = 0; i < arr.length; i++) {
            pairs[i] = new Pair(arr[i][0], arr[i][1]);
        }

        Arrays.sort(pairs);
        Stack<Pair> st = new Stack<>();
        for(int i = 0; i < pairs.length; i++){
            if(i == 0){
                st.push(pairs[i]);
            } else {
                Pair top = st.peek();

                if(pairs[i].st > top.et){
                    st.push(pairs[i]);
                } else {
                    top.et = Math.max(top.et, pairs[i].et);
                }
            }
        }
        Stack<Pair> rs = new Stack<>();
        while (st.size() > 0) {
            rs.push(st.pop());
        }
        while (rs.size() > 0) {
            Pair p = rs.pop();
            System.out.println(p.st + " " + p.et);
        }
    }
}

class Pair implements Comparable<Pair> {
    int st;
    int et;
    Pair(int st, int et){
        this.st = st;
        this.et = et;
    }
    // this > other -> +ve
    // this = other -> 0
    // this < other -> -ve
    public int compareTo(Pair other){
        if(this.st != other.st){
            return this.st - other.st;
        } else {
            return this.et - other.et;
        }
    }
}