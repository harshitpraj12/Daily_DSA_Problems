package LeetCode;

public class ValidPalindrom {
    public static void main(String[] args) {
        // String str = "A man, a plan, a canal: Panama";
        String str = "race a car";
        if(solve(str)){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }

    private static boolean solve(String str) {
        int left = 0;
        int right = str.length()-1;
        while(left<right){
            char str1 = str.charAt(left);
            char str2 = str.charAt(right);
            if(!Character.isLetterOrDigit(str1)){
                left++;
            }else if (!Character.isLetterOrDigit(str2)) {
                right--;
            }else{
                if(Character.toLowerCase(str1)!=Character.toLowerCase(str2)){
                    return false;
                }
                left++;
                right--;
            }
        }
        return false;
    }
}
