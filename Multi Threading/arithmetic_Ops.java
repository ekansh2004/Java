import java.util.Scanner;
class add extends Thread {
    int a, b;
    @Override
    public void run() {
        // for(int i = 0; i < 200; i++) {
        //     Add();
        // }
        Add();
    }
    public void setA(int a) {
        this.a = a;
    }
    public void setB(int b) {
        this.b = b;
    }
    public void Add() {
        int c;
        c = this.a + this.b;
        System.out.println("The addition of the two number is = " + c);
    }
}
class sub extends Thread {
    int a,b;
    @Override
    public void run() {
        // for(int i = 0; i < 200; i++) {
        //     Sub();
        // }
        Sub();
    }
    public void setA(int a) {
        this.a = a;
    }
    public void setB(int b) {
        this.b = b;
    }
    public void Sub() {
        int c;
        c = this.a - this.b;
        System.out.println("The subration of the two number is = " + c);
    }
}
class mul extends Thread {
    int a,b;
    @Override
    public void run(){
        // for(int i = 0; i < 200; i++) {
        //     Mul();
        // }
        Mul();
    }
    public void setA(int a) {
        this.a = a;
    }
    public void setB(int b) {
        this.b = b;
    }
    public void Mul() {
        int c;
        c = this.a * this.b;
        System.out.println("The multiplications of the two number is = " + c);
    }
}
class div extends Thread {
    int a,b;
    @Override
    public void run() {
        // for(int i = 0; i < 200; i++) {
        //     Div();
        // }
        Div();
    }
    public void setA(int a) {
        this.a = a;
    }
    public void setB(int b) {
        this.b = b;
    }
    public void Div() {
        int c;
        c = this.a / this.b;
        System.out.println("The division of the two numbers is = " + c);
    }
}


public class arithmetic_Ops {
    public static void main(String[] args) {
        // Input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number = ");
        int a = sc.nextInt();
        System.out.print("Enter second number = ");
        int b = sc.nextInt();
        sc.close();
        add a1 = new add();
        sub s1 = new sub();
        mul m1 = new mul();
        div d1 = new div();
        a1.setA(a);
        a1.setB(b);
        s1.setA(a);
        s1.setB(b);
        m1.setA(a);
        m1.setB(b);
        d1.setA(a);
        d1.setB(b);

        // Seting Priorities
        a1.setPriority(10);
        s1.setPriority(1);
        d1.setPriority(4);
        m1.setPriority(7);

        // Starting
        a1.start();
        s1.start();
        m1.start();
        d1.start();
    }    
}