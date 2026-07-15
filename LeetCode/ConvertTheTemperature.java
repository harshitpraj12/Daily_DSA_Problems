package LeetCode;

import java.util.Arrays;

public class ConvertTheTemperature {
    public static void main(String[] args) {
        double celsius = 36.50;
        double [] ans = new double[2];
        double fh = celsius*1.80+32.00;
        double kelvin = (celsius+273.15);
        double farenhite = fh;

        ans[0]=kelvin;
        ans[1]=farenhite;
        System.out.println("Answer : "+ Arrays.toString(ans));
    }
}
