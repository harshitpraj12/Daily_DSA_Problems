package GFG;

public class MaximumNumberOfPeopleDefeated {
    public static void main(String[] args) {
        int p = 169;
        int ans = solve(p);
        System.out.println(ans);
    }

    private static int solve(int p) {
        int ans = 0;
        int num = 0;
        for(int i=1; i*i<=p; i++){
            if(ans<=p && ans+(i*i)<=p){
                ans+=i*i;
                num++;
            }
        }
        return num;
    }
}
