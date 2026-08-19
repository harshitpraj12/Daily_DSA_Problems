package tcs;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class MyClass2
{
public static void main(String [] args)
{
	Scanner sc = new Scanner(System.in);
	ArrayList<Double> list = new ArrayList<>();
    String s = sc.nextLine().trim();
	String l = "52.2";
	Double m = Double.parseDouble(l);
	System.out.println(l.getClass().getSimpleName());
	System.out.println(m.getClass().getSimpleName());
	if(m.getClass().getSimpleName().equals("Double")) System.out.println("Hello");
	System.out.println(m);


	String ss = "hello my name is harshit raj";
    String [] str = s.split("\\s+");
	System.out.println(Arrays.toString(str));
    if(!s.isEmpty()){
        Scanner sss = new Scanner(ss);
		while (sss.hasNextDouble()) {
			list.add(sss.nextDouble());
		}
    }
	double ans = solve(list);
	System.out.println(ans);
    sc.close();
}
public static double solve(ArrayList<Double> list){
	HashMap<Double, Integer> map = new HashMap<>();
	for(double n: list){
		map.put(n, map.getOrDefault(n, 0)+1);
	}
	double sum = 0;
	for(Map.Entry<Double, Integer> entry : map.entrySet()){
		if(entry.getValue()==2) sum+=entry.getKey();
	}
	return sum;
}
}
