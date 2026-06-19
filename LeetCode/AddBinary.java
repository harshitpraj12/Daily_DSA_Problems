package LeetCode;

public class AddBinary {
    public static void main(String[] args) {
        String a = "1010";
        String b = "1011";
        String ans = solve(a, b);
        System.out.println(ans);
    }

    private static String solve(String a, String b) {
        StringBuilder result = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;

        // Loop as long as there are characters to process or a carry remains
        while (i >= 0 || j >= 0 || carry > 0) {
            int sum = carry;

            // Add bit from string 'a' if available
            if (i >= 0) {
                sum += a.charAt(i) - '0'; // Convert char to int ('1' -> 1, '0' -> 0)
                i--;
            }

            // Add bit from string 'b' if available
            if (j >= 0) {
                sum += b.charAt(j) - '0';
                j--;
            }

            // Append the current bit (sum % 2) to the StringBuilder
            result.append(sum % 2);

            // Calculate the new carry (sum / 2)
            carry = sum / 2;
        }

        // Since we added bits from right to left, reverse the final string
        return result.reverse().toString();
    }

    // private static String solve(String a, String b) {
    //     int al = a.length();
    //     int bl = b.length();
    //     int i=al-1, j=bl-1;
    //     StringBuilder str = new StringBuilder();
    //     int carry=0;
    //     while(i>=0 && j>=0){
    //         int a1 = a.charAt(i--);
    //         int b1 = b.charAt(j--);
    //         int sum = summm(a1, b1);
    //         int help = summm(sum, carry);
    //         str.append(help);
    //         carry = carryyy(a1, b1);   
    //     }

    // }

    // private static int carryyy(int a1, int b1) {
    //     if(a1==1 && b1==1) return 1;
    //     else return 0;
    // }

    // private static int summm(int a1, int b1) {
    //     if(a1==1 || b1==1) return 1;
    //     else return 0;
    // }
}
