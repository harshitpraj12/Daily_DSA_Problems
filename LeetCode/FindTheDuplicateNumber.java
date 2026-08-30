package LeetCode;

public class FindTheDuplicateNumber {
    public static void main(String[] args) {
        int [] arr = {3, 2, 4, 1, 1};
        int ans = solve(arr);
        System.out.println(ans);
    }

    private static int solve(int[] arr) {
        int slow = arr[0];
        int fast = arr[0];
        while(true){
            slow = arr[slow];
            fast = arr[arr[fast]];
            if(slow==fast) break;
        }
        System.out.println(slow);
        slow = arr[0];
        while(slow!=fast){
            slow=arr[slow];
            fast=arr[fast];
        }
        return slow;
    }
}
