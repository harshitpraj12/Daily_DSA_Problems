package striverDsaSheet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PascalsTriangle {
    public static void main(String[] args) {
        int numRows = 10;
        List<List<Integer>> result = solve(numRows);
        for(List<Integer> ans : result){
            System.out.println(ans);
        }
    }

    private static List<List<Integer>> solve(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>(Arrays.asList(1)));
        for(int i=1; i<=numRows; i++){
            List<Integer> list = new ArrayList<>();
            List<Integer> preList = result.get(i-1);
            list.add(1);
            for(int j=1; j<i; j++){
                list.add(preList.get(j-1)+preList.get(j));
            }
            list.add(1);
            result.add(list);
        }
        return result;
    }
}
