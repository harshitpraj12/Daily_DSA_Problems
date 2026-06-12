package LeetCode;

public class potd1266 {
    public static void main(String[] args) {
        int [][] points = {{1, 1}, {3, 4},{-1, 0}};
        int ans = 0;
        for(int i=0; i<points.length-1; i++){
            int a1 = Math.abs(points[i][0]-points[i+1][0]);
            int a2 = Math.abs(points[i][1]-points[i+1][1]);
            ans+=Math.max(a1, a2);
        }
        System.out.println("Max time is : "+ ans);
    }
}
