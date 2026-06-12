public class DecimalToBinary {
    public static void main(String[] args) {
        StringBuilder ans = new StringBuilder();
        int a = 108765;
        while(a!=1){
            ans.append(a%2);
            a/=2;
        }
        ans.append(1);
        ans.reverse();
        System.out.println(ans);
    }
}
