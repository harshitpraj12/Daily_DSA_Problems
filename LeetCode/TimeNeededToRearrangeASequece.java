package LeetCode;

public class TimeNeededToRearrangeASequece {
    public static void main(String[] args) {
        String str = "0110101";
        System.out.println(solve(str));
    }

    private static int solve(String str) {
        int count = 0;
        // while(str.contains("01")){
        //     str = str.replace("01", "10");
        //     System.out.println(str);
        //     count++;
        // }
        int zero = 0;
        int first = 0;
        boolean firstZero = false;
        for(int i=0; i<str.length(); i++){
            if(!firstZero && str.charAt(i)=='0'){
                firstZero = true;
                first = i;
            }
            if(str.charAt(i)=='0') zero++;
        }
        System.out.println(zero);
        System.out.println(first);
        return str.length()-(zero+first);
    }
}
