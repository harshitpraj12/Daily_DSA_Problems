package LeetCode;

import java.util.HashSet;

public class NumberOfStringExistsInWord {
    public static void main(String[] args) {
        String [] str = {"dojsf","v","hetnovaoigv","ksvqfdojsf","hetnovaoig","yskjs","sfr","msurztkvppptsluk","ndxffbkkvejuakduhdcfsdbgbt","znhdgtwzbnh","h","ocaualfiscmbpnfalypmtdppymw","w","o","sfjksvqfdo","odqvzuc","bozawheajcmlewptgssueylcxhx","bno","jhmarzsphxduvdktzqjiz","j","sfrjhetnov","vxv","ksvqfd","ognwvqtadalmav","yqbspvfwmvhycmghabigl","qyfaiazgdqaw","ojsfrj","ojsfrjhetn","fdojs","do","ovaoig","k","vrh","jsfrjhetnovaoigvgk"};
        String s = "csfjksvqfdojsfrjhetnovaoigvgk";
        int a = solve(str, s);
        System.out.println(a);
    }

    private static int solve(String[] str, String s) {
        // HashSet<Character> set = new HashSet<>();
        // for(char ch : s.toCharArray()){
        //     set.add(ch);
        // }
        // int count = 0;
        // for(String st : str){
        //     boolean check = true;
        //     for(char ch : st.toCharArray()){
        //         if(!set.contains(ch)) check = false;
        //     }
        //     if(check){
        //         count++;
        //         System.out.println(st);
        //     }
        // }
        // return count;
        int count = 0;
        for(String st : str){
            if(s.contains(st)){
                count++;
            }
        }
        return count;
    }
}
