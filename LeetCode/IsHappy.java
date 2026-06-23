package LeetCode;

public class IsHappy {
    public static void main(String[] args) {
        int n= 2;
        if(solve(n)){
            System.out.println("TRUE");
        }else{
            System.out.println("FALSE");
        }
    }

    private static boolean solve(int n) {
        int slow = n;
        int fast = getNext(n);
        
        // Move pointers until they meet or fast hits 1
        while (fast != 1 && slow != fast) {
            slow = getNext(slow);         // moves 1 step
            fast = getNext(getNext(fast)); // moves 2 steps
            System.out.println("Slow "+slow);
            System.out.println("fast "+fast);
        }
        
        // If fast reached 1, it's a happy number
        return fast == 1;
    }

    private static int getNext(int num) {
        int totalSum = 0;
        while (num > 0) {
            int digit = num % 10;
            totalSum += digit * digit;
            num /= 10;
        }
        return totalSum;
    }
}
