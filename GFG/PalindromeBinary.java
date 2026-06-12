package GFG;

public class PalindromeBinary {
    public static void main(String[] args) {
        int a = 16;
        if(solve(a)){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }

    private static boolean solve(int a) {
        String str = Integer.toBinaryString(a);
        // String revStr = new StringBuilder(str).reverse().toString();
        // return str.equals(revStr);
        int left = 0;
        int right = str.length()-1;
        while(left<right){
            if(str.charAt(left)!=str.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }
}
