class Base1 {
    int idB;
    public void setIdB(int id) {
        this.idB = id;
    }
    public int getIdB() {
        return idB;
    }
}

class Derived1 extends Base1 {
    int idDer;
    public void setIddDer(int id) {
        this.idDer = id;
    }
    public int getIdDer() {
        return idDer;
    }
}


public class inheritance {
    public static void main(String[] args) {
        Derived1 d = new Derived1();

        d.setIdB(12);
        System.out.println("Base class id = " + d.getIdB());
    }
}
