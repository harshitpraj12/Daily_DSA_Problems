package CollectionsDemo;

import java.util.*;

public class ListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        Set<Integer> s = new TreeSet<>();
        s.add(12);
        s.add(13);
        s.add(19);
        s.add(13);
        s.add(15);
        System.out.println(s);
        System.out.println(s.size());
        List<Integer> l = new ArrayList<>();
        Queue<Integer> q= new ArrayDeque<>();
        Scanner sc = new Scanner(System.in);
    }
}
