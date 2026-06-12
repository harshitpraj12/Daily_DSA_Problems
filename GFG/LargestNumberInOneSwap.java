package GFG;

public class LargestNumberInOneSwap {
    public static void main(String[] args) {
        String str = "768";
        System.out.println(solve(str));
    }

    private static String solve(String s) {
        char [] digits = s.toCharArray();
        int n = digits.length;

        int [] arr = new int[10];
        for(int i = 0; i<n; i++){
            arr[digits[i]-'0']=i;
        }
        for(int i=0; i<n; i++){
            for(int j=9; j>(digits[i]-'0'); j--){
                if(arr[j]>i){
                    char temp = digits[i];
                    digits[i] = digits[arr[j]];
                    digits[arr[j]] = temp;
                    
                    return new String(digits);
                }
            }
        }
        return s;
    }
}
