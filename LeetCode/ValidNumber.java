package LeetCode;

public class ValidNumber {
    public static void main(String[] args) {
        String s = "-123.456e-7e89";
        if(solve(s)){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }

    private static boolean solve(String s) {
        boolean isDigit = false;
        boolean isExponent = false;
        boolean isDot = false;
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(Character.isDigit(c)){
                isDigit = true;
            }else if(c=='+' || c=='-'){
                if(i>0 && s.charAt(i-1)!='e' && s.charAt(i-1)!='E'){
                    return false;
                }
            }else if(c=='.'){
                if(isDot || isExponent){
                    return false;
                }
                isDot = true;
            }else if(c=='e' || c=='E'){
                if(isExponent || !isDigit){
                    return false;
                }
                isExponent = true;
                isDigit = false;
            }else{
                return false;
            }
        }
        return isDigit;
    }
}
