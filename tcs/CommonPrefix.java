package tcs;

public class CommonPrefix {
    public static void main(String[] args) {
        String a = "flower";
        String b = "flow";
        StringBuilder sb = new StringBuilder();
        int idx = 0;
        while(idx<a.length() && idx<b.length() && a.charAt(idx)==b.charAt(idx)){
            sb.append(a.charAt(idx++));
        }
        System.out.println(sb.toString());
    }
}
