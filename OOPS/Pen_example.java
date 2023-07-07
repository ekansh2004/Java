abstract class Pen{
    abstract void write();
    abstract void refil();
}

class FountainPen extends Pen {
    public void write() {
        System.out.println("Writing using Fountain pen");
    }
    public void refil() {
        System.out.println("Refilling Fountain Pen");
    }
    public void changeNib() {
        System.out.println("Changing nib of Fountain Pen");
    }
}

public class Pen_example {
    public static void main(String[] args) {
        FountainPen fp = new FountainPen();
        fp.write();
        fp.refil();
        fp.changeNib();
    }
}
