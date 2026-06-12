package DSA_problem;


public class Recurssion1 {
    public void iterative(int n){
        for(int i=1; i<=n; i++)
            System.out.println(i);
        rec(3);
    }
    public void rec(int n){
        if(n<=0) return;
        System.out.println(n); 
        rec(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        Recurssion1 r = new Recurssion1();
        // r.iterative(6);
        System.out.println("Break");
        r.rec(6);
    }
    
}
