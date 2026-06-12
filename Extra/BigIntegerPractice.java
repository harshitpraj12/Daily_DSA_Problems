import java.math.BigInteger;
import java.util.Scanner;

public class BigIntegerPractice {
    public static void main(String[] args) {
        int a;
        try (Scanner sc = new Scanner(System.in)) {
            a = sc.nextInt();
            System.out.println("value of a is: "+ a);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Value of a is: ");
        BigInteger value = new BigInteger("17");
        BigInteger value2 = new BigInteger("23");
        System.out.println(value.isProbablePrime(10));
        System.out.println(value.isProbablePrime(100));
        System.out.println("next prime number is: "+ value.nextProbablePrime());
        System.out.println(value.xor(value));
        System.out.println(value.xor(value2));
    }
}
