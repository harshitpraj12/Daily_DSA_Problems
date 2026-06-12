package GFG;

import java.util.HashMap;

public class BusTicketChange {
    public static void main(String[] args) {
        int person [] = {5, 5, 10, 20};
        if(available(person)){
            System.out.println("Yes i have change");
        }else{
            System.out.println("No i dont have change");
        }
    }

    private static boolean available(int[] arr) {
        boolean ans = false;
        // if(persons[0]<0 || persons[1]<0  || persons[2]<0){
            //     return false;
            // }
        int [] persons = {0, 0, 0};
        for(int i=0; i<arr.length; i++){
            int a = arr[i];
            switch(a){
                case 5:
                    persons[0]++;
                    ans = true;
                    break;
                case 10:
                    if(persons[0]>=1){
                        persons[0]--;
                        persons[1]++;
                        ans = true;
                    }else{
                        return false;
                    }
                    break;
                case 20:
                    if(persons[0]>=1 && persons[1]>=1){
                        persons[0]--;
                        persons[1]--;
                        persons[2]++;
                        ans = true;
                    }else if(persons[0]>=3){
                        persons[0]-=3;
                        persons[2]++;
                        ans = true;
                    }else{
                        return false;
                    }
                    break;
                default:
                    return false;
            }
        }
        return ans;
    }
}
