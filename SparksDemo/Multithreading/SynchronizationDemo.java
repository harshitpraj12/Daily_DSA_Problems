package Multithreading;

class Counter{
    private int count=0;
    public synchronized void incr(){
        count++;
    }
    public int getCount() { 
        return count;
    }
}
class CounterDemo extends Thread{
    private Counter counter;
    CounterDemo(Counter counter){
        this.counter=counter;
    }
    @Override
    public void run() {
        for(int i=0; i<10; i++){
            System.out.println(Thread.currentThread());
            counter.incr();
        }
        System.out.println("hemlo "+ Thread.currentThread()+" "+ counter.getCount());
    }
}
public class SynchronizationDemo {
    public static void main(String[] args) throws InterruptedException {
        // CounterDemo t = new CounterDemo(counter);
        // t.start();
        Counter counter = new Counter();
        Thread t1 = new CounterDemo(counter);
        Thread t2 = new CounterDemo(counter);
        t1.start();
        // t1.join();
        t2.start();

        System.out.println("Final Count "+ counter.getCount());
    }
}
