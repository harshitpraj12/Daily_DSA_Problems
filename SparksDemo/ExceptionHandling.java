import java.util.Scanner;

class ThrowsDemo{
    void m1() throws ArithmeticException{
        m2();
    }
    void m2() throws ArithmeticException{
        m3();
    }
    void m3() throws ArithmeticException{
        System.out.println(2/0);

    }
}
public class ExceptionHandling {
    public static void main(String[] args) throws ArithmeticException{
        // try (Scanner sc = new Scanner(System.in)) {
        //     int a = sc.nextInt();
        //     System.out.println("Number is: "+ a);
        // } catch (Exception e) {
        //     System.out.println("I don't know dear");
        // }

        // try {
        //     System.out.println(10/0);
        // } catch (ArithmeticException e) {
        //     System.out.println(e.getMessage());
        // } catch (Exception e) {
        //     System.out.println("Pagal ho kya tum");
        // } finally {
        //     System.out.println("This block always executed");
        // }

        // ThrowsDemo throwsDemo = new ThrowsDemo();
        // throwsDemo.m1();
        // System.out.println("Hello");
        // System.out.println("It's me......");
        // System.out.println("Harshit Raj");
    }
}
