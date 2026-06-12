public class StringReverse {
    public static void main(String[] args) {
        String s = "Hello I am Harshit Raj";
        // Brute Force approach
        StringBuilder sb = new StringBuilder(s);
        String a = sb.reverse().toString();
        System.out.println(sb.toString());
        System.out.println(a);
    }
}
