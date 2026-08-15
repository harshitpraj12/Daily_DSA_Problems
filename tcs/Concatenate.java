package tcs;

public class Concatenate {
    public static void main(String[] args) {
        int n = 10203004;
        String s = Integer.toString(n);
        long sum = 0;
        long num = 0;
        for(char c : s.toCharArray()){
            int a = c-'0';
            if(a!=0){
                sum+=a;
                num=num*10+a;
            }
        }
        System.out.println(num*sum);
    }
}
