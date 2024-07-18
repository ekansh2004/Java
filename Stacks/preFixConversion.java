import java.util.Scanner;
import java.util.Stack;

public class preFixConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter expression = ");
        String exp = sc.next();
        sc.close();

        Stack<Integer> vs = new Stack<>();
        Stack<String> is = new Stack<>();
        Stack<String> ps = new Stack<>();

        for(int i = exp.length() - 1; i >= 0; i--){
            char ch = exp.charAt(i);
            if(ch == '+' || ch == '-' || ch == '*' || ch == '/'){
                int v1 = vs.pop();
                int v2 = vs.pop();
                int val = operation(v1, v2, ch);
                vs.push(val);
                
                String inv1 = is.pop();
                String inv2 = is.pop();
                String inval = "(" + inv1 + ch + inv2 + ")"; 
                is.push(inval);

                String pov1 = ps.pop();
                String pov2 = ps.pop();
                String poval = pov1  + pov2 + ch; 
                is.push(poval);
            } else {
                vs.push(ch - '0');
                is.push(ch + "");
                ps.push(ch + "");
            }
        }

        System.out.println("PreFix Eval Value is = " + vs.pop());
        System.out.println("Infix conversion = " + is.pop());
        System.out.println("PostFix Convertion = " + ps.pop());
    }

    public static int operation(int v1, int v2, char op){
        if(op == '+'){
            return v1 + v2;
        } else if(op == '-'){
            return v1 - v2;
        } else if(op == '*'){
            return v1 * v2;
        }else{
            return v1 / v2;
        }
    }
}
