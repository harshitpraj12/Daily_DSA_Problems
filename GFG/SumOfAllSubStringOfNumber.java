package GFG;

public class SumOfAllSubStringOfNumber {
    public static void main(String[] args) {
        String s = "1234";
        int n = s.length();
        int sum = 0;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<=n; j++){
                String k = s.substring(i, j);
                System.out.println(k);
                int a = Integer.parseInt(k);
                sum+=a;
            }
        }
        System.out.println(sum);
    }
}
