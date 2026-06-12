package Multithreading;

class SavingAccount{
    public synchronized void withdraw(String name){
        for(int i=0; i<4; i++){
            System.out.print("Money withdraw by= ");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(name);
        }
        System.out.println("*******Completed******");
    }

}
class MyThread extends Thread{
    SavingAccount s;
    String name;
    MyThread(SavingAccount s, String name){
        this.s = s;
        this.name = name;
    }
    @Override
    public void run() {
        s.withdraw(name);
    }
}
public class SynchronizedDemo2 {
    public static void main(String[] args) {
        SavingAccount s = new SavingAccount();
        MyThread t1 = new MyThread(s, "pati");
        MyThread t2 = new MyThread(s, "patni");
        t1.start();
        t2.start();
    }
}
