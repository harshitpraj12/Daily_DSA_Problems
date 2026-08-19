package tcs;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Map.Entry;

public class ExpenseTracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int income = sc.nextInt();
        sc.nextLine();
        HashMap<String, Integer> map = new HashMap<>();
        int expense = 0;
        while(true){
            String cat = sc.nextLine();
            if(cat.equals("Done")){
                break;
            }
            int ex = sc.nextInt();
            sc.nextLine();
            map.put(cat, map.getOrDefault(cat, 0)+ex);
            expense+=ex;
        }
        System.out.println("Total Income : "+ income);
        System.out.println("Total Expense : "+ expense);
        System.out.println("Total Saving : " + (income-expense));
        for(Entry<String, Integer> entry : map.entrySet()){
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
    }
}
