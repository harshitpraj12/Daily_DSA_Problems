public class Hashing {
    public static void main(String[] args) {
        String str = "Harshit";
        int h1 = str.hashCode();
        String str2 = "Harshit";
        int h2 = str2.hashCode();
        if(h1==h2){
            System.out.println("Hash matches");
        }else{
            System.out.println("Don't match");
        }
    }
}
