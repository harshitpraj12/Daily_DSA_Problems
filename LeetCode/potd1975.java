package LeetCode;

public class potd1975 {
    public static void main(String[] args) {
        int [][] matrix = {{1, 2, 3}, {-1, -2, -3},{1, 2, 3}};
        long totalSum = 0;
        int minAbs = Integer.MAX_VALUE;
        int count = 0;
        for(int [] row : matrix){
            for(int ele : row){
                if(ele<0) count++;
                totalSum += Math.abs(ele);
                minAbs = Math.min(minAbs, Math.abs(ele));
            }
        }
        if(count%2==0){
            System.out.println("Total sum is: "+ totalSum);
        }else{
            long ans = totalSum - 2*minAbs;
            System.out.println("Total sum is: "+ ans);
        }
    }
}
