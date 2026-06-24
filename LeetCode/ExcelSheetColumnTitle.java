package LeetCode;

import java.util.HashMap;

public class ExcelSheetColumnTitle {
    public static void main(String[] args) {
        int num = 701;
        String str = solve(num);
        System.out.println(str);
    }

    private static String solve(int num) {
        StringBuilder str = new StringBuilder();
        while(num>0){
            num--;
            int a = num%26;
            str.append((char)('A'+a));
            num/=26;
        }
        return str.reverse().toString();
    }
}
