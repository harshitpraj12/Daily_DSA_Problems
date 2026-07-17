package LeetCode;

public class Operations {
    public static void main(String[] args) {
        String [] str = {"X++","++X","--X","X--"};
        int a=0;
        for(int i=0; i<str.length; i++){
            if(str[i].equals("++X")||str[i].equals("X++")){
                a=a+1;
            }else{
                a=a-1;
            }
        }
        System.out.println(a);
    }
}
