import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {
        String name = "Harshit Raj";
        // tihsraH jaR
        String str = "";
        System.out.println(name);
        String [] name1 = name.split(" ");
        System.out.println(Arrays.toString(name1));
        for(int i = 0; i<name1.length; i++){
            StringBuilder sb = new StringBuilder(name1[i]);
            name1[i] = sb.reverse().toString();
        }
        System.out.println(Arrays.toString(name1));
        for(String s: name1){
            str+=s+" ";
        }
        System.out.println(str);

    }
}
