import java.util.*;

/*
 * You are given n number of bulbs. They are all switched off. 
 * A weird fluctuation in voltage hits the circuit n times. 
 * In the 1st fluctuation, all bulbs are toggled, in the 2nd fluctuation 
 * every 2nd bulb is toggled, in the 3rd fluctuation, every 3rd bulb is 
 * toggled, and so on. You've to find which bulbs will be switched on 
 * after n fluctuations.
 * 
 * Take as input a number n, representing the number of bulbs.
 * 
 * Print all the bulbs that will be on after the nth fluctuation in voltage.
*/

public class benjamin_Bulbs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number = ");
        int n = sc.nextInt();
        sc.close();

        System.out.println();
        System.out.print("The Bulbs that are still on after " + n + " fluctuations are ");
        for(int i = 1; i * i <= n; i++) {
            System.out.print(i * i + " ");
        }
    }
}
// The bulbs that are perfect squares have odd number of factors. So they are left on.