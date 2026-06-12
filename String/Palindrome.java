package String;

public class Palindrome {
    public static void main(String[] args) {
        // String a = "Racecar";
        // a=a.toLowerCase();
        // int left = 0;
        // int right = a.length()-1;
        // while(left<right){
        //     if(a.charAt(left)!=a.charAt(right)){
        //         System.out.println("false");
        //         break;
        //     }else{

        //     }
        //     left++;
        //     right--;
        // }
        String a = "Racecar";
        if(check(a)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }

    private static boolean check(String a) {
        a=a.toLowerCase();
        int left = 0;
        int right = a.length()-1;
        while(left<right){
            if(a.charAt(left)!=a.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
