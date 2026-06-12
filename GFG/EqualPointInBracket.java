package GFG;

public class EqualPointInBracket {
    public static void main(String[] args) {
        String s = "(())))(";
        int a = solve(s);
        System.out.println(a);
    }

    private static int solve(String s) {
        int count = 0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)==')'){
                count++;
            }
        }
    
        return count;
    }
}
