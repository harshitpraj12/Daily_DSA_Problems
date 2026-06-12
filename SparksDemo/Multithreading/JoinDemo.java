package Multithreading;

class Demo implements Runnable{
    @Override
    public void run() {
        for(int i=0; i<20; i++){
            
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+i);
            
        }
    }
}
public class JoinDemo {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(new Demo(), "Basic");
        t.start();
        t.join();
        System.out.println("Final");
    }
}
