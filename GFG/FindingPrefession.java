package GFG;

public class FindingPrefession {
    public static void main(String[] args) {
        int level = 6;
        int pos = 21;
        System.out.println(solve(level, pos));
    }

    private static String solve(int level, int pos) {
        // int count = Integer.bitCount(pos-1);
        // return count%2==0?"Enginner":"Doctor";
        if(pos==1) return "Engineer";
        String parent = solve(level-1, (pos-1)/2);
        if(pos%2==0){
            return parent.equals("Engineer")?"Engineer":"Doctor";
        }else{
            return parent;
        }
    }
}
