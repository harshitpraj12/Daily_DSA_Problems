package LeetCode;

public class ExcelSheetColumnNumber {
    public static void main(String[] args) {
        String str = "ZY";
        System.out.println(solve(str));
    }

    private static int solve(String str) {
        int num=0;
        for(char ch : str.toCharArray()){
            int a = ch-'A'+1;
            num = num*26+a;
        }
        return num;
    }
}
