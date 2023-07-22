import java.util.*;

public class Nested_try_catch {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a number = ");
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0; i < n; i++) {
                System.out.print("Enter element at index " + i + " = ");
                arr[i] = sc.nextInt();
            }
            sc.close();

            try {
                arr[n] = 12;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Array out of bounds ");
                System.out.println("Level 2 exception");
            }
        } 
        catch (Exception e) {
            System.out.println("Level 1 error");
        }
    }
}
