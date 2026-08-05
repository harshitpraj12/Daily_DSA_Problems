package tcs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Transaction{
    String sender;
    String receiver;
    Double amount;
    Long time;
    public Transaction(String sender, String receiver, Double amount, Long time) {
        this.sender = sender;
        this.receiver = receiver;
        this.amount = amount;
        this.time = time;
    }
}
public class FraudTransactions {
    public static void main(String[] args) {
        Transaction transaction1 = new Transaction("anu", "john", 100d, 1000l);
        Transaction transaction2 = new Transaction("anu", "john", 100d, 1050l);
        Transaction transaction3 = new Transaction("ram", "sham", 150d, 2000l);
        Transaction transaction4 = new Transaction("anu", "john", 100d, 1100l);
        Scanner sc = new Scanner(System.in);
        // List<Transaction> tra = new ArrayList<>();
        // while(sc.hasNext()){
        //     String sender = sc.next();
        //     String receiver = sc.next();
        //     Double amount = sc.nextDouble();
        //     Long time = sc.nextLong();

        //     tra.add(new Transaction(sender, receiver, amount, time));
        // }
        List<Transaction> list = new ArrayList<>();
        list.add(transaction1);
        list.add(transaction2);
        list.add(transaction3);
        list.add(transaction4);

        List<Transaction> ans = solve(list);
        for (Transaction t : ans) {
            System.out.println(t.sender + " " + t.receiver + " " + t.amount + " " + t.time);
        }
    }

    private static List<Transaction> solve(List<Transaction> list) {
        List<Transaction> ans = new ArrayList<>();
        boolean [] isFraud = new boolean[list.size()];
        for(int i=0; i<list.size(); i++){
            for(int j=i+1; j<list.size(); j++){
                Transaction t1 = list.get(i);
                Transaction t2 = list.get(j);
                if(
                    t1.sender.equals(t2.sender) 
                    && t1.receiver.equals(t2.receiver) 
                    && t1.amount.equals(t2.amount) 
                    && t2.time-t1.time<=60
                ){
                    if(!isFraud[i]){
                        ans.add(list.get(i));
                    }
                    if(!isFraud[j]){
                        ans.add(list.get(j));
                    }
                    isFraud[i]=true;
                    isFraud[j]=true;
                }
            }
        }
        return ans;
    }
}
