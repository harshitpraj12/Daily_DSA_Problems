package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class LetterCombinationOfAPhoneNumber {
    public static void main(String[] args) {
        String digit = "2345";
        List<String> ans = solve(digit);
        System.out.println(ans);
    }

    private static List<String> solve(String digit) {
        int [] num = {2, 3, 4, 5, 6, 7, 8, 9};
        String [] ch = {"abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        List<String> ans = new ArrayList<>();
        switch (digit.length()) {
            case 1:
                int a = Integer.parseInt(digit);
                for(char c : ch[a-2].toCharArray()){
                    ans.add(String.valueOf(c));
                }
                return ans;
            case 2:
                a = digit.charAt(0)-'0';
                int b = digit.charAt(1)-'0';
                for(int i=0; i<ch[a-2].length(); i++){
                    String s = String.valueOf(ch[a-2].charAt(i));
                    for(int j=0; j<ch[b-2].length(); j++){
                        s+=String.valueOf(ch[b-2].charAt(j));
                        ans.add(s);
                        s=String.valueOf(ch[a-2].charAt(i));
                    }
                }
                return ans;
            case 3:
                a = digit.charAt(0)-'0';
                b = digit.charAt(1)-'0';
                int c = digit.charAt(2)-'0';
                for(int i=0; i<ch[a-2].length(); i++){
                    String s = String.valueOf(ch[a-2].charAt(i));
                    for(int j=0; j<ch[b-2].length(); j++){
                        s+=String.valueOf(ch[b-2].charAt(j));
                        for(int k=0; k<ch[c-2].length(); k++){
                            s+=String.valueOf(ch[c-2].charAt(k));
                            ans.add(s);
                            s=String.valueOf(ch[a-2].charAt(i))+String.valueOf(ch[b-2].charAt(j));
                        }
                        s=String.valueOf(ch[a-2].charAt(i));
                    }
                }
                return ans;
            case 4:
                a = digit.charAt(0)-'0';
                b = digit.charAt(1)-'0';
                c = digit.charAt(2)-'0';
                int d = digit.charAt(3)-'0';
                for(int i=0; i<ch[a-2].length(); i++){
                    String s = String.valueOf(ch[a-2].charAt(i));
                    for(int j=0; j<ch[b-2].length(); j++){
                        s+=String.valueOf(ch[b-2].charAt(j));
                        for(int k=0; k<ch[c-2].length(); k++){
                            s+=String.valueOf(ch[c-2].charAt(k));
                            for(int l=0; l<ch[d-2].length(); l++){
                                s+=String.valueOf(ch[d-2].charAt(l));
                                ans.add(s);
                                s=String.valueOf(ch[a-2].charAt(i))+String.valueOf(ch[b-2].charAt(j))+String.valueOf(ch[c-2].charAt(k));
                            }
                            s=String.valueOf(ch[a-2].charAt(i))+String.valueOf(ch[b-2].charAt(j));
                        }
                        s=String.valueOf(ch[a-2].charAt(i));
                    }
                }
                return ans;
        }
        return ans;
    }
}
