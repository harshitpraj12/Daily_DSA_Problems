package String;

public class CharAt {
    public static void main(String[] args) {
        String str1 = "Harshit Raj";
        String str2 = "is a good boy";
        String str3 = "   Raj   ";
        String str4 = "Raj";
        System.out.println(str1.concat(str2));
        System.out.println(str1.charAt(5));
        System.out.println(str1.compareTo(str2));
        System.out.println(str1.compareToIgnoreCase(str2));
        System.out.println(str1.contains(str4));
        System.out.println(str3);
        System.out.println(str3.trim());
        System.out.println(str3.replace("aj", "am"));
        System.out.println(str3.indexOf("j"));
        System.out.println(str3.substring(2));
        System.out.println(str2.strip());
        System.out.println(str2.replace(" ", ""));
    }
    
}
