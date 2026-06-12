import java.util.Scanner;

public class PrimeUsingCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int a = sc.nextInt();
        int count=0;
        if(a<1){
            System.out.println("Non Prime");
            return;
        }
        for(int i=1; i<=a; i++){
            if(a%i==0){
                count++;
            }
        }
        if(count==2){
            System.out.println("Prime Number");
            System.out.println("Only two divisors");
        }else{
            System.out.println(a+ " is Non Prime number");
            System.out.println("can divide by more than 1 and itself!!!!");
        }
    }
}
