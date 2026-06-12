package LeetCode;

public class XORAfterRange {
    public static void main(String[] args) {
        int [] nums = {2, 3, 1, 5, 4};
        int [][] queries = {{1,4,2,3}, {0,2,1,2}};
        int ans = solve(nums, queries);
        System.out.println("Answer is : "+ ans);
    }

    /* 
    queries[i] = [li, ri, ki, vi].
    For each query, you must apply the following operations in order:
    While idx <= ri:
    Update: nums[idx] = (nums[idx] * vi) % (109 + 7)
    Set idx += ki.
    Return the bitwise XOR of all elements in nums after processing all queries.
    Set idx = li.
    */
    private static int solve(int[] nums, int[][] queries) {
        int mod = (int)Math.pow(10, 9)+7;
        for(int [] query : queries){
            int l = query[0];
            int r = query[1];
            int k = query[2];
            long v = query[3];
            for(int i=l; i<=r; i+=k){
                long update = ((long)nums[i] * v) % mod;
                nums[i] = (int)update;
            }
        }
        int xor = 0;
        for(int a : nums){
            xor^=a;
        }
        return xor;
    }
}
