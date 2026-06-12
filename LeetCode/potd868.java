package LeetCode;

public class potd868 {
    public static void main(String[] args) {
        int n = 9;
        int pre = -1;
        int pos = 0;
        int ans = 0;
        while(n!=0){
            if((n&1)==1){
                if(pre != -1){
                    ans = Math.max(ans, pos-pre);
                }
                pre = pos;
            }
            pos++;
            n>>=1;
        }
        System.out.println("Max : "+ ans);
    }
}
