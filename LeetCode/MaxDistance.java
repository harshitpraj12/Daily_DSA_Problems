package LeetCode;

public class MaxDistance {
    public static void main(String[] args) {
        // int [] num1 = {55,30,5,4,2};
        // int [] num2 = {100,20,10,10,5};
        int [] num1 = {30,29,19,5};
        int [] num2 = {25,25,25,25,25};
        System.out.println(solve(num1, num2));
    }

    private static int solve(int[] num1, int[] num2) {
        int n1 = num1.length;
        int n2 = num2.length;
        int dis = 0;
        for(int i=0; i<n1; i++){
            // for(int j=i; j<n2; j++){
            //     if(num1[i]<=num2[j]){
            //         dis = Math.max(dis, j-i);
            //     }
            // }
            int a = num1[i];
            int left = i;
            int right = n2-1;
            while(left<right){
                int mid = left + (right-left)/2;
                if(a<=num2[mid]){
                    
                }
            }
        }
        return dis;
    }
}
