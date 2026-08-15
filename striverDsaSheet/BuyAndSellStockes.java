package striverDsaSheet;

public class BuyAndSellStockes {
    public static void main(String[] args) {
        int [] arr = {9, 2, 4, 7, 1, 4, 9};
        int max = 0;
        int a = arr[0];
        for(int i=1; i<arr.length; i++){
            int b = arr[i];
            if((b-a)<=0){
                a=b;
                continue;
            }else{
                max = Math.max(max, b-a);
            }
        }
        System.out.println(max);
    }
}
