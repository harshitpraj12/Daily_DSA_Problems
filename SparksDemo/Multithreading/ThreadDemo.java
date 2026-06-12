package Multithreading;


class ThreadTest extends Thread{
    @Override
    public void run() {
        for(int i = 0; i<20; i++){
            // System.out.println(Thread.currentThread());
            System.out.println(i);
        }
    }
}
public class ThreadDemo {
    public static void main(String[] args) {
        ThreadTest t = new ThreadTest();
        t.start();
        for(int i = 0; i<20; i++){
            // System.out.println(Thread.currentThread());
            System.out.println("Main Thread");
        }
    }
}
