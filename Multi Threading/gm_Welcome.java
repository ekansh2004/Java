class c1 extends Thread {
    @Override
    public void run() {
        int i = 0;
        while(i < 400) {
            System.out.println("Good Morning");
            i++;
        }
    }
}

class c2 extends Thread {
    @Override
    public void run() {
        int i = 0;
        while(i < 400) {
            /* 
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            */
            System.out.println("Welcome");
            i++;
        }
    }
}

public class gm_Welcome {
    public static void main(String[] args) {
        c1 o1 = new c1();
        c2 o2 = new c2();
        // o1.start();
        
        // o1.setPriority(5);
        // o2.setPriority(1);
        System.out.println("Thread 1 priority is = " + o1.getPriority());
        System.out.println("Thread 2 priority is = " + o2.getPriority());
        System.out.println("Thread 2 state is = " + o2.getState());
        
        o2.start();
        System.out.println("Thread 2 state is = " + o2.getState());
        System.out.println("State of current thread = " + Thread.currentThread().getState());
    }
}
