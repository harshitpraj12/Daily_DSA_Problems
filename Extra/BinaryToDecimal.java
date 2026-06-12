public class BinaryToDecimal {
    public static void main(String[] args) {
        // int a = 123;
        // String str = Integer.toBinaryString(a);
        // System.out.println("Binary : "+ str);
        
        // char [] arr = str.toCharArray();
        // int ans = 0;
        // int count = 0;
        // for(int i=arr.length-1; i>=0; i--){
        //     int ar = arr[i];
        //     int po = (int)Math.pow(2, count++);
        //     ans = ans+ (po * ar);
        // }

        // System.out.println("Decimal : "+ ans );
        // System.out.println(Math.pow(2, 10));

        int a = 1111011;
        int ans = 0;
        int count = 0;
    
        while(a!=0){
            int as = a%10;
            int asd = as*(int)Math.pow(2, count++);
            ans+=asd;
            a=a/10;
        }
        System.out.println(ans);
    }
}
