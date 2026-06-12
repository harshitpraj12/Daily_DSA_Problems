package LeetCode;
class Solution {
    public int sumFourDivisors(int[] nums) {
        int totalSum = 0;

        for (int n : nums) {
            int count = 0;
            int sum = 0;

            for (int i = 1; i * i <= n; i++) {
                if (n % i == 0) {
                    int d1 = i;
                    int d2 = n / i;

                    if (d1 == d2) {
                        count++;
                        sum += d1;
                    } else {
                        count += 2;
                        sum += d1 + d2;
                    }

                    if (count > 4) break;
                }
            }

            if (count == 4) {
                totalSum += sum;
            }
        }

        return totalSum;
    }
}

public class SumOfAllFourDivisors1390 {

    public static void main(String[] args) {
        int nums[] = {21, 21, 21};
        Solution solution = new Solution();
        int result = solution.sumFourDivisors(nums);
        System.out.println("Total sum of all the factors who have only four divisors: "+ result);
    }
    
}
