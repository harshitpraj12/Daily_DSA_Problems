package String;

public class Comparision {
    public static void main(String[] args) {
        String s1 = "raj";
        String s2 = "raj";
        String s3 = new String("raj");
        String s4 = new String(s2);
        System.out.println(s2.compareTo(s4));
        System.out.println(s1.compareTo(s2));
        System.out.println(s2.compareTo(s3));
        System.out.println(s3.compareTo(s4));
        System.out.println(s4);
    }
    
}
