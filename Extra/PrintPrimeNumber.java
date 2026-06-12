import java.util.Scanner;

public class PrintPrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Range: ");
        int a = sc.nextInt();
        System.out.print("2 3 ");
        for(int i=4; i<=a; i++){
            boolean isPRime = true;
            for(int j=2; j<=Math.sqrt(i); j++){
                if(i%j==0){
                    isPRime = false;
                    break;
                }
            }
            if(isPRime){
                System.out.print(i+" ");
            }
        }
    }
}
