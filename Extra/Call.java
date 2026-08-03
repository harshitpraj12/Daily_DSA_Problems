import java.util.Arrays;

public class Call {
    public static void main(String[] args) {
        int a = 10;
        int [] arr = {1,2, 3, 4, a};
        solve(a, arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(a);
    }

    private static void solve(int a, int [] arr) {
        System.out.println("method"+a);
        a+=20;
        arr[2]=10;
        System.out.println("method after"+a);
    }
}
