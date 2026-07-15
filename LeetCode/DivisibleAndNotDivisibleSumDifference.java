package LeetCode;

public class DivisibleAndNotDivisibleSumDifference {
    public static void main(String[] args) {
        int n = 10;
        int m= 3;
        int num1 = 0;
        int num2 = 0;
        for(int i=1; i<=n; i++){
            if(i%m==0){
                num2+=i;
            }else{
                num1+=i;
            }
        }
        System.out.println(num1-num2);
    }
}
