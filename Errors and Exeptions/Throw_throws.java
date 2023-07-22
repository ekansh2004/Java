class Neg_Err extends Exception {
    @Override
    public String toString() {
        return "Radius cannot be negative";
    }
    @Override
    public String getMessage() {
        return "Radius cannot be negative message";
    }
}

public class Throw_throws {

    public static double area(int r) throws Neg_Err {
        if(r < 0) {
            throw new Neg_Err();
        }
        double res = Math.PI * r * r;
        return res;
    }
    public static void main(String[] args) {
        try{
            double ar = area(6);
            System.out.println("Area is " + ar);
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }
        
    }
}
