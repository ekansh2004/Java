import java.util.*;

public class matrice_Add {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][] m1 = new int[2][3];
        System.out.println("Enter values of Matrice 1 (2x3) below");
        for(int i = 0; i < 2; i++) {
            for(int j = 0; j < 3; j++) {
                System.out.print("Enter element (" + (i+1) + ", " + (j+1) + ") = ");
                m1[i][j] = sc.nextInt();
            }
        }
        
        int [][] m2 = new int[2][3];
        System.out.println("Enter values of Matrice 2 (2x3) below");
        for(int i = 0; i < 2; i++) {
            for(int j = 0; j < 3; j++) {
                System.out.print("Enter element (" + (i+1) + ", " + (j+1) + ") = ");
                m2[i][j] = sc.nextInt();
            }
        }
        sc.close();
        int [][] sum = new int[2][3];

        for(int i = 0; i < 2; i++) {
            for(int j = 0; j < 3; j++) {
                sum[i][j] = m1[i][j] + m2[i][j];
            }
        }
        System.out.println();
        System.out.println("The answer is");
        for(int i = 0; i < 2; i++) {
            for(int j = 0; j < 3; j++) {
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }
    }
}