import java.util.*;

class My_Exception extends Exception {
    @Override
    public String toString() {
        return "toString() called";
    }
    @Override
    public String getMessage() {
        return "getMessage() called";
    }
}

class Max_Age_Exception extends Exception {
    @Override 
    public String toString() {
        return "Age cannot be greater than 135";
    }
    @Override
    public String getMessage() {
        return "Make sure value of entered age is correct";
    }
}

public class Exception_Class {
    public static void main(String[] args) {
        System.out.print("Enter a number = ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        sc.close();
        System.out.println();
        if(a < 9) {
            try {
                // throw new MyException();
                throw new ArithmeticException("Arithmetic Exception");
            }
            catch(Exception e) {
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                e.printStackTrace();
                System.out.println("After Stack trace");
            }
            System.out.println("After try Catch");
        }
    }
}
