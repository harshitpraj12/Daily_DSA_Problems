package LeetCode;

public class DateToBinary {
    public static void main(String[] args) {
        String date = "2080-02-29";
        System.out.println(solve(date));
    }

    private static String solve(String date) {
        String[] split = date.split("-");
        StringBuilder st = new StringBuilder();
        int n = 0;
        for(String s : split){
            int a = Integer.parseInt(s);
            String aa = Integer.toBinaryString(a);
            st.append(aa);
            if(n<2){
            st.append("-");
            n++;
            }
        }
        return st.toString();
    }
}
