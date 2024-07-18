import java.util.Scanner;
import java.util.Stack;

public class infixEvaluation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the expression = ");
        String exp = sc.nextLine();
        sc.close();

        Stack<Integer> opnd = new Stack<>();
        Stack<Character> opr = new Stack<>();

        for(int i = 0; i < exp.length(); i++){
            char ch = exp.charAt(i);

            if(ch == '('){
                opr.push(ch);
            } else if (Character.isDigit(ch)){
                opnd.push(ch - '0');
            } else if (ch == ')'){
                while(opr.peek() != '('){
                    char oprt = opr.pop();
                    int v2 = opnd.pop();
                    int v1 = opnd.pop();
                    int x = opr(v1,v2,oprt);
                    opnd.push(x);
                }
                opr.pop();
            } else if (ch == '+' || ch == '-' || ch == '*' || ch == '/'){
                while(opr.size() > 0 && opr.peek() != '(' && prio(ch) <= prio(opr.peek())){
                    char oprt = opr.pop();
                    int v2 = opnd.pop();
                    int v1 = opnd.pop();
                    int x = opr(v1,v2,oprt);
                    opnd.push(x);
                }
                opr.push(ch);
            }
        }
        while(opr.size() != 0){
            char oprt = opr.pop();
            int v2 = opnd.pop();
            int v1 = opnd.pop();

            opnd.push(opr(v1,v2,oprt));
        }
        int x = opnd.pop();
        System.out.println("The result of the expression is = " + x);
    }
        

    public static int prio(char opr){
        if(opr == '+'){
            return 1;
        } else if(opr == '-'){
            return 1;
        } else if(opr == '*'){
            return 2;
        } else {
            return 2;
        }
    }

    public static int opr(int v1, int v2, char opr){
        if(opr == '+'){
            return v1 + v2;
        } else if(opr == '-'){
            return v1 - v2;
        } else if(opr == '*'){
            return v1 * v2;
        } else {
            return v1 / v2;
        }
    }
}
