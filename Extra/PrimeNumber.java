import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int a = sc.nextInt();
        if(isPrime(a, a/2)==0){
            System.out.println("Non Prime");
        }else{
            System.out.println("Prime");
        }
    }

    private static int isPrime(int a, int i) {
        if(a<=0) return 0;
        if(i==1) return 1;
        if(a%i==0) return 0;
        return isPrime(a, i-1);
    }
}
