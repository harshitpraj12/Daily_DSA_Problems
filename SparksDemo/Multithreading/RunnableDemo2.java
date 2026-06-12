package Multithreading;

class demo implements Runnable{
    @Override
    public void run() {
        for(int i=0; i<20; i++){
            System.out.println(Thread.currentThread());
            System.out.println("Child");
        }
    }
}
public class RunnableDemo2 {
    public static void main(String[] args) {
        Thread t1 = new Thread(new demo(), "Thread-1");
        Thread t2 = new Thread(new demo(), "Thread-2");
        t2.setPriority(4);
        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());
        // t1.start();
        Thread t = new Thread();
        System.out.println(t.getPriority());
        // t2.start();
        // for(int i=0; i<20; i++){
        //     System.out.println(Thread.currentThread());
        //     System.out.println("Main");
        // }
    }
}
