import java.util.Scanner;

public class Array_Index_Guess {
    public static void main(String[] args) {
        int [] arr = new int[3];
        arr[0] = 32;
        arr[1] = 56;
        arr[2] = 65;
        int index;
        int i = 0;
        Scanner sc = new Scanner(System.in);
        while(i < 5){
            try{
                System.out.print("Enter an index = ");
                index = sc.nextInt();
                System.out.println("Value at " + index + " is = " + arr[index]);
                break;
            }
            catch(Exception e) {
                System.out.println("Invalid index");
                i++;
            }
        }
        sc.close();
        if(i >= 5){
            System.out.println("Error");
        }
    }
}
