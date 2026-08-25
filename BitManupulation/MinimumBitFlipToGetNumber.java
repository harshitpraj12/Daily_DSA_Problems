package BitManupulation;

public class MinimumBitFlipToGetNumber {
    public static void main(String[] args) {
        int a = 10;
        int b = 7;
        System.out.println(Integer.bitCount(a^b));
    }
}
