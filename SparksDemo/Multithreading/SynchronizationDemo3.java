package Multithreading;

class Account{
    private int balance = 100;
    public synchronized void deposit(int amount){
        if(amount>0){
            System.out.print("Deposit by: ");
            balance=balance+amount;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName());
            System.out.println("Your balance is: "+ balance);
        }else{
            System.out.println("Wrong Amount entered"+ Thread.currentThread().getName());
        }
        System.out.println("***********Deposit Completed*********");
    }
    public synchronized void withdraw(int amount){
        if(amount<=balance){
            System.out.print("Withdraw by: ");
            balance=balance-amount;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName());
            System.out.println("Your balance is: "+ balance);
        }else{
            System.out.println("Inefficient Balance"+  Thread.currentThread().getName());
        }
        System.out.println("**********Withdraw Completed***********");
    }
    public synchronized void getBalance(){
        System.out.print("Balance checked by: ");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName());
        System.out.println("Your balance is: "+ balance);
        System.out.println("************Balance Completed***********");
    }
}

// class MyThread1 extends Thread{
//     Account account;
//     int amount;
//     String name;
//     MyThread1(Account account, int amount, String name){
//         this.account = account;
//         this.amount = amount;
//         this.name = name;
//     }
//     @Override
//     public void run() {
//         account.deposit(amount);
//         account.withdraw(amount);
//         account.getBalance();
//     }
// }
class WithdrawThread extends Thread{
    Account account;
    int amount;
    WithdrawThread(Account account, int amount){
        this.account = account;
        this.amount= amount;
    }
    @Override
    public void run() {
        account.withdraw(amount);
    }
}
class DepositThread extends Thread{
    Account account;
    int amount;
    DepositThread(Account account, int amount){
        this.account = account;
        this.amount= amount;
    }
    @Override
    public void run() {
        account.deposit(amount);
    }
}
class CheckBalance extends Thread{
    Account account;
    CheckBalance(Account account){
        this.account = account;
    }
    @Override
    public void run() {
        account.getBalance();
    }
}
public class SynchronizationDemo3 {
    public static void main(String[] args) {
        Account a = new Account();
        WithdrawThread t0 = new WithdrawThread(a, 150);
        DepositThread t1 = new DepositThread(a, 50);
        CheckBalance t2 = new CheckBalance(a);

        t2.start();
        t0.start();
        t1.start();
        t2.start();
    }
}
