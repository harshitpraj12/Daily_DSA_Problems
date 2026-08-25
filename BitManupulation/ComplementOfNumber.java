package BitManupulation;

public class ComplementOfNumber {
    public static void main(String[] args) {
        int a = 5;
        int count = Integer.toBinaryString(a).length();
        int b = (1<<count)-1;
        System.out.println(a^b);
    }
}
