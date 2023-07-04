import java.util.*;

class cyl {
    int r;
    int h;
    public void setH(int h) {
        this.h = h;
    }
    public void setR(int r) {
        this.r = r;
    }
    public int getH() {
        return h;
    }
    public int getR() {
        return r;
    }
    public float sa() {
        float res = 0;
        res = (2 * (22/7) * r * h) + (2 * (22/7) * r * r);

        return res;
    }
    public float vol() {
        float res = 0;
        res = (22/7) * r * r * h;

        return res;
    }
}
public class Cylinder {
    public static void main(String[] args) {
        cyl ob = new cyl();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius of cylinder = ");
        int rad = sc.nextInt();
        ob.setR(rad);
        System.out.print("Enter Height of cylinder = ");
        int hgt = sc.nextInt();
        ob.setH(hgt);
        sc.close();

        float sa = ob.sa();
        float vol = ob.vol();

        System.out.println();
        System.out.println("The surface area of the cylinder is = " + sa);
        System.out.println();
        System.out.println("The Volume of the cylinder is = " + vol);
    }
}
