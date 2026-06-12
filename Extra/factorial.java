public class factorial {
    class fact{
        int a;
        fact(int a){
            this.a = a;
        }
        static int factorial(int a){
            if(a==0 || a==1){
                return 1;
            }
            return a*factorial(a-1);
        }
    }
    static int fac(int a){
        if(a==0||a==1){
            return 1;
        }
        return a * fac(a-1);
    }
    public static void main(String[] args) {
        int ans = fact.factorial(9);
        System.out.println(ans);
        System.out.println("ans is: "+ fac(9));
    }
}
