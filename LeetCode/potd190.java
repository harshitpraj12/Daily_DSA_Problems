package LeetCode;

public class potd190 {
    public static void main(String[] args) {
        int a = 43261596;
        // Output is : 964176192

        // StringBuilder s = new StringBuilder(Integer.toBinaryString(a));
        // System.out.println(s);
        // s.reverse();
        // System.out.println(s);
        // String str = new String(s);
        // System.out.println(Integer.parseInt(str, 2));

        StringBuilder s = new StringBuilder();
        int c = 0;
        while(a!=0 || c<32){
            if(a%2==0){
                s.append(0);
            }else{
                s.append(1);
            }
            a=a/2;
            c++;
        } 
        // s.reverse();
        String str = new String(s);

        System.out.println("Binary is "+ s);
        System.out.println("Value is : "+ Integer.parseInt(str, 2));

        
    }
}
