package LeetCode;

public class MoveToStartOdString {
    public static void main(String[] args) {
        String str = "hello#my#name#is#harshit#raj";
        String ans = solve(str);
        System.out.println(ans);
    }

    private static String solve(String str) {
        // StringBuilder sb = new StringBuilder();
        // StringBuilder ss = new StringBuilder();
        // for(char a : str.toCharArray()){
        //     if(a!='#'){
        //         sb.append(a);
        //     }else{
        //         ss.append('#');
        //     }
        // }
        // return (ss.toString()+sb.toString());
        int n = str.length();
        char [] ans = new char[n];
        int idx = n-1;
        for(int i=n-1; i>=0; i--){
            if(str.charAt(i)!='#'){
                ans[idx--]=str.charAt(i);
            }
        }
        while(idx>=0){
            ans[idx--]='#';
        }
        return new String(ans);
    }
}
