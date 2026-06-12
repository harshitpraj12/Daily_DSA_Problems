package GFG;

public class IsomorphicString {
    public static void main(String[] args) {
        String s1 = "aab";
        String s2 = "xyz";
        if(compare(s1, s2)){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }



    private static boolean compare(String s1, String s2) {
        // if(s1.length()!=s2.length()){
        //     return false;
        // }
        // char [] a1 = s1.toCharArray();
        // char [] a2 = s2.toCharArray();
        // int [] arr = new int[26];

        // boolean ans = false;
        
        // for(int i=0; i<a1.length; i++){
        //     if((arr[a1[i]-'a'])==0){
        //         arr[a1[i]-'a'] = a1[i]-a2[i];
        //         System.out.println("...."+arr[a1[i]-'a']);
        //         ans = true;
        //     }else{
        //         if((arr[a1[i]-'a']==a1[i]-a2[i])){
        //             ans = true;
        //         }else{
        //             ans = false;
        //             break;
        //         }
        //     }
        //     System.out.println(a1[i]-a2[i]);
        // }
        // return ans;
        if (s1.length() != s2.length()) return false;

        // Use 256 to handle all standard ASCII characters
        int[] m1 = new int[26]; 
        int[] m2 = new int[26];

        for (int i = 0; i < s1.length(); i++) {
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(i);

            // If these characters haven't been seen yet, 
            // mark them with their current position + 1 (to avoid default 0)
            if (m1[c1-'a'] != m2[c2-'a']) {
                return false;
            }

            m1[c1-'a'] = i + 1;
            m2[c2-'a'] = i + 1;
        }

        return true;
    }
}
