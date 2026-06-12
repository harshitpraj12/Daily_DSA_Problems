package LeetCode;

import java.math.BigInteger;

public class CountNumberOfStepToReduceZero {
    public static void main(String[] args) {
        // String str ="1111011110000011100000110001011011110010111001010111110001";
        String str ="1111110011101010110011100100101110010100101110111010111110110010";
        BigInteger num = new BigInteger(str, 2);
        
        int ans = 0;
        while(!num.equals(BigInteger.ONE)){
            if(num.divide(BigInteger.TWO).multiply(BigInteger.TWO)==num){
                ans+=1;
            }else{
                num.add(BigInteger.ONE);
                ans+=2;
            }
            num = num.divide(BigInteger.TWO);
        }
        System.out.println(ans);
    }
}
