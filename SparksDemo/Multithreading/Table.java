package Multithreading;

class T implements Runnable{
    int a = 6;
    @Override
    public void run() {
        for(int i=1; i<=10; i++){
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(a+"X"+i+"="+a*i);
        }
    }
}
public class Table {
    public static void main(String[] args) {
        // This print a table with a time gap of 2 second...
        Thread t = new Thread(new T());
        t.start();
    }
}
