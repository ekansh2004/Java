import java.util.*;

/*
    Design an algorithm that collects daily price quotes for some stock and returns the 
    span of that stock's price for the current day.

    The span of the stock's price in one day is the maximum number of 
    consecutive days (starting from that day and going backward) for which the 
    stock price was less than or equal to the price of that day.

    For example, if the prices of the stock in the last four days is [7,2,1,2] and the
    price of the stock today is 2, then the span of today is 4 because starting from today, 
    the price of the stock was less than or equal 2 for 4 consecutive days.

    Also, if the prices of the stock in the last four days is [7,34,1,2] and 
    the price of the stock today is 8, then the span of today is 3 because starting from today, 
    the price of the stock was less than or equal 8 for 3 consecutive days.
*/


public class stockSpan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of prices = ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] span = new int[n];
        for(int i = 0; i < n; i++) {
            System.out.print("Enter element at index " + i + " = ");
            arr[i] = sc.nextInt();
        }
        sc.close();

        Stack<Integer> st = new Stack<>();

        st.push(0);
        span[0] = 1;
        for(int i = 1; i < arr.length; i++){
            //-a+
            while (st.size() > 0 && arr[i] >= arr[st.peek()]) {
                st.pop();
            }
            if(st.size() == 0){
                span[i] = i + 1;
            } else {
                span[i] = i - st.peek();
            }
            st.push(i);
        }

        System.out.println();
        System.out.print("The span of all the stocks are = ");
        for(int i = 0; i < span.length; i++){
            System.out.print(span[i] + " ");
        }
        System.out.println();
    }
}
