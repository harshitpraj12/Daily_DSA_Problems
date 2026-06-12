package DynamicProgramming;

public class TabulationFibSeries {

    // Using tabulation method you can found solution in TC=O(n) SC=O(1)

    static int count=0;

    public static void main(String[] args) {
        int n = 4;
        int pre = 1;
        int pre2 = 0;
        for(int i=2; i<=n; i++){
            count++;
            int cur = pre + pre2;
            pre2 = pre;
            pre = cur;
        }
        System.out.println("Answer is : "+ pre+". Total calls are "+ count);
    }
}
