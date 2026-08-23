package LeetCode;

public class SumGame {
    public static void main(String[] args) {
        String num = "?3295???";
        if(solve(num)){
            System.out.println("Alice wins not equals! ");
        }else{
            System.out.println("Bob wins Equals! ");
        }
    }

    private static boolean solve(String num) {
        int n = num.length();
        int sumDif = 0;
        int markDif = 0;
        for(int i=0; i<n; i++){
            int sign = ((i < n/2) ? 1 : -1);
            char c = num.charAt(i);
            if(c=='?'){
                markDif += sign;
            }else{
                sumDif += sign * (c - '0');
            }
        }
        if((markDif & 1) != 0){
            return true;
        }
        return ((sumDif * 2 + markDif * 9)!=0);
    }
}
