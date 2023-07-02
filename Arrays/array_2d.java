import java.util.*;

public class array_2d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] flats;
        System.out.print("Enter number of floors = ");
        int f = sc.nextInt();
        System.out.print("Enter number of flats on each floor = ");
        int fl = sc.nextInt();
        flats = new int [f] [fl];
        for(int i = 0; i < f; i++) {
            for(int j = 0; j < fl; j++) {
                System.out.print("Enter flat number on floor " + (i+1) + " = ");
                flats[i][j] = sc.nextInt();
            }
        }
        sc.close();
        
        System.out.println();
        for(int i = 0; i < f; i++) {
            for(int j = 0; j < fl; j++) {
                System.out.print(flats[i][j] + " ");
            }
            System.out.println();
        }
    }
}
