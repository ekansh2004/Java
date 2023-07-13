class c1 implements Runnable{
    @Override
    public void run(){
        for(int i = 1; i < 400; i++){
            System.out.println("Thread 1 1 1 1 1 1 1 1 1 1 1 1 1 ");
        }
    }
}

class c2 implements Runnable {
    @Override 
    public void run() {
        for(int i = 1; i < 400; i++) {
            System.out.println("Thread 2 2 2 2 2 2 2");
        }
    }
}

public class Runable_Interface {
    public static void main(String[] args) {
        c1 o1 = new c1();
        Thread t1 = new Thread(o1);
        c2 o2 = new c2();
        Thread t2 = new Thread(o2);

        t1.start();
        t2.start();
    }
}