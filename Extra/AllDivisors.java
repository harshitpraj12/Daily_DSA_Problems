import java.util.ArrayList;

public class AllDivisors {
    public static void main(String[] args) {
        // int a = 21;
        // ArrayList<Integer> arr = new ArrayList<>();
        // for(int i=1; i<=a; i++){
        //     int count=0;
        //     for(int j=1; j<=i; j++){
        //         if(i%j==0){
        //             count++;
        //             arr.add(j);
        //         }
        //     }
        //     if(count==4){
        //         System.out.print(i+" ");
        //         for(int j=1; j<=i; j++){
        //         if(i%j==0){
        //             arr.add(j);
        //         }
        //     }
        //     }
        // }
        // for(int e : arr){
        //     System.out.print(e+" ");
        // }
    
        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<Integer> ans = new ArrayList<>();
        arr.add(21);
        arr.add(21);
        // arr.add(22);
        // arr.add(41);
        for(int e: arr){
            int count=0;
            for(int j=1; j<=e; j++){
                if(e%j==0){
                    count++;
                }
            }
            if(count==4){
                for(int j=1; j<=e; j++){
                if(e%j==0){
                    ans.add(j);
                }
            }
            }
            count=0;
        }
        int result=0;
        for(int a: ans){
            result+=a;
        }
        System.out.println(result);
    }
}
