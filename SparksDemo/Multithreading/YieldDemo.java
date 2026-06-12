package Multithreading;

class Yield1 implements Runnable{
    @Override
    public void run() {
        for(int i=0; i<20; i++){
            // Thread.yield();
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+i);
            // Thread.yield();
        }
    }
}
class Yield2 implements Runnable{
    @Override
    public void run() {
        for(int i=0; i<20; i++){
            System.out.println(Thread.currentThread().getName()+i);
        }
    }
}
public class YieldDemo {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Yield1(), "one");
        Thread t2 = new Thread(new Yield2(), "two");
        t1.start();
        t2.start();
    }
}
