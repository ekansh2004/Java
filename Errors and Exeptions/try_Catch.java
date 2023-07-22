public class try_Catch {
    public static void main(String[] args) {
        int a = 60;
        int b = 0;
        int c;

        try {
            c = a/b;
            System.out.println("The result is = " + c);
        }
        catch(Exception e) {
            System.out.println("Could not print division");
            System.out.print("Reason is = ");
            System.out.print(e);
        }
    }
    
}