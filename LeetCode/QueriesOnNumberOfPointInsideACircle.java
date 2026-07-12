package LeetCode;

import java.util.Arrays;

public class QueriesOnNumberOfPointInsideACircle {
    public static void main(String[] args) {
        int [][] points = {{1, 1}, {2, 2}, {3, 3}, {4, 4}, {5, 5}};
        int [][] queries = {{1, 2, 2}, {2, 2, 2}, {4, 3, 2}, {4, 3, 3}};
        int [] ans = solve(points, queries);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] solve(int[][] points, int[][] queries) {
        int [] ans = new int[queries.length];
        int idx = 0;
        for(int [] querie : queries){
            int x1 = querie[0];
            int y1 = querie[1];
            int dis = querie[2];
            int count = 0;
            for(int [] point : points){
                int x2 = point[0];
                int y2 = point[1];
                double rad = Math.sqrt(((x1-x2)*(x1-x2))+((y1-y2)*(y1-y2)));
                if(rad<=dis) count++;
            } 
            ans[idx++]=count;
        }
        return ans;
    }
}
