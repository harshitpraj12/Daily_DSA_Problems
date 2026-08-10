package tcs;

public class GymTotalCost {
    public static void main(String[] args) {
        int month = 10;
        int amount = solve(month);
        System.out.println(amount);
    }

    private static int solve(int month) {
        // 3- 5000
        // 6- 7000
        // 9- 12000
        // 12- 15000
        int amount = 0;
        while(month>0){
            if(month>=9){
                amount+=15000;
                month-=12;
            }else if(month>=6 && month<9){
                amount+=12000;
                month-=9;
            }else if(month>=3 && month<6){
                amount+=7000;
                month-=6;
            }else if(month>=1 && month<3){
                amount+=5000;
                month-=3;
            }
        }
        return amount;
    }
}
