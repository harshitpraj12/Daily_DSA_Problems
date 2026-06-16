package LeetCode;

public class FindTheIndex {
    public static void main(String[] args) {
        String string = "fassadharshsadlove";
        String subString = "sad";
        System.out.println(solve(string, subString));
    }

    private static int solve(String string, String subString) {
        int m = string.length();
        int n = subString.length();
        if(n>m) return -1;
        if(n==m && string.equals(subString)) return 0;
        for(int i=0; i<=m-n; i++){
            int j = 0;
            while(j<n && string.charAt(i+j)==subString.charAt(j)){
                j++;
            }
            if(j==n){
                return i;
            }
        }
        return -1;
    }
}
