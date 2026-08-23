package LeetCode;

public class SquareRoot {
    public static void main(String[] args) {
        int x = 2147395600;
        int left = 1;
        int right = x/2;
        int ans = 1;
        System.out.println(4&1);
        System.out.println(3&1);
        while(left<=right){
            int mid = left+(right-left)/2;
            if(mid<=x/mid){
                ans=mid;
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        System.out.println(ans);
    }
}
