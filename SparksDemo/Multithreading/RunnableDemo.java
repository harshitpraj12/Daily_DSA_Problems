package Multithreading;

class MyRun implements Runnable{
    @Override
    public void run() {
        for(int i=0; i<20; i++){
            System.out.println("Runnable");
        }
    }
}
public class RunnableDemo {
    public static void main(String[] args) {
        MyRun r = new MyRun();
        Thread t = new Thread(r);
        t.start();
        for(int i=0; i<20; i++){
            System.out.println("Main");
        }
    }
}
