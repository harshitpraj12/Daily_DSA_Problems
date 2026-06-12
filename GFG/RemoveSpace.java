package GFG;

public class RemoveSpace {
    public static void main(String[] args) {
        String str = "  g eeks for ge eks  ";
        str = str.trim();
        str = str.replaceAll("\\s", "");
        System.out.println(str);
        String s = solve(str);
        System.out.println(s);
    }

    private static String solve(String str) {
        String result = str.replaceAll(" ", "");
        return result;
    }
}
