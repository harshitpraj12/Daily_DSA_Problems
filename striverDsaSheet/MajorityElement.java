package striverDsaSheet;

public class MajorityElement {
    public static void main(String[] args) {
        int [] arr = {2, 2, 2, 1, 1, 1, 2, 2};
        int ans = solve(arr);
        System.out.println(ans);
        
    }

    private static int solve(int[] arr) {
        int count = 0;
        int num = 0;
        for(int n : arr){
            if(count==0){
                num = n;
            }
            if(n==num){
                count++;
            }else{
                count--;
            }
        }
        return num;
    }
}
