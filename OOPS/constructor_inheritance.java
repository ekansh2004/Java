class Base2 {
    public Base2() {
        System.out.println("Base class constructor");
    }
    public void bPr() {
        System.out.println();
    }
}

class Derived2 extends Base2 {
    public Derived2() {
        System.out.println("Deriver class constructor");
    }
    public void derPr() {
        System.out.println();
    }
}

public class constructor_inheritance {
    public static void main(String[] args) {
        Base2 b = new Base2();
        b.bPr();
        Derived2 d = new Derived2();
        d.derPr();
    }
}