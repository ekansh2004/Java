import java.util.*;

public class stack_Declaration {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();

        st.push(10);
        System.out.println("Stack is = " + st);
        System.out.println("Peek = " + st.peek());
        System.out.println("Size of stack is = " + st.size());
        System.out.println();

        st.push(20);
        System.out.println("Stack is = " + st);
        System.out.println("Peek = " + st.peek());
        System.out.println("Size of stack is = " + st.size());
        System.out.println();

        st.push(30);
        System.out.println("Stack is = " + st);
        System.out.println("Peek = " + st.peek());
        System.out.println("Size of stack is = " + st.size());
        System.out.println();

        st.push(40);
        System.out.println("Stack is = " + st);
        System.out.println("Peek = " + st.peek());
        System.out.println("Size of stack is = " + st.size());
        System.out.println();

        st.pop();
        System.out.println("Stack is = " + st);
        System.out.println("Peek = " + st.peek());
        System.out.println("Size of stack is = " + st.size());
        System.out.println();

        st.pop();
        System.out.println("Stack is = " + st);
        System.out.println("Peek = " + st.peek());
        System.out.println("Size of stack is = " + st.size());
        System.out.println();

        st.pop();
        System.out.println("Stack is = " + st);
        System.out.println("Peek = " + st.peek());
        System.out.println("Size of stack is = " + st.size());
        System.out.println();

        st.pop();
        System.out.println("Stack is = " + st);
        System.out.println("Size of stack is = " + st.size());
        // If we try to peek it will give runtime error
    }
}