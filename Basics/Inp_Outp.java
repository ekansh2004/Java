import java.util.*;

public class Inp_Outp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a integer = ");
        int n = sc.nextInt();
        System.out.println("The integer entered is = " + n);

        sc.nextLine(); // consumes the new line character in the input buffer 
        //                to ensure the next sc.nextLine takes correct input 

        System.out.print("Enter a string = ");
        String s1 = sc.nextLine(); // Takes whole line as input (including space)
        System.out.println("Entered string is = " + s1);
        System.out.print("Enter a string with a space = ");
        String s2 = sc.next(); // Takes input till first space
        String s3 = sc.next(); // Takes input after space
        System.out.println("Before space = " + s2);
        System.out.println("After space = " + s3);
        sc.close();
    }
}
// For, while , do-while, break, continue
// if, else, if-else, switch 
// These are same as in c++ 