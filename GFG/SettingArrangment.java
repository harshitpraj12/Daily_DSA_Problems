package GFG;

public class SettingArrangment {
    public static void main(String[] args) {
        int k = 1;
        int seats[] = {0, 0};
        // int k = 2;
        // int seats[] = {0, 0, 1, 0, 0, 0, 1};
        if(solve(k, seats)){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }

    private static boolean solve(int k, int[] seats) {
        if(k<=0) return true;
        if(seats.length==1 && k<=1 && seats[0]==0){
            return true;
        }
        if(seats.length==2 && seats[0]==0 && seats[1]==0 && k==1){
            return true;
        }
        int count = 0;
        
        if(seats[0]==0 && seats[1]==0){
            count++;
            seats[0]=1;
        }
        for(int i=1; i<seats.length-1; i++){
            if(seats[i-1]==0 && seats[i]==0 && seats[i+1]==0){
                count++;
                seats[i]=1;
            }
            if(count>=k) return true;
        }
        return false;
        
    }
}
