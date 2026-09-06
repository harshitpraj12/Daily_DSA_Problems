import java.util.ArrayList;
import java.util.Random;

public class Faster {
    public static void main(String[] args) {
        Random rand = new Random();
        int [] a = new int[10000000];
        int [] b = new int[10000000];
        for(int i=0; i<10000000; i++){
            a[i]=rand.nextInt();
            b[i]=rand.nextInt();
        }
        int [] c = new int[10000000];
        long time = System.currentTimeMillis();
        for(int i=0; i<10000000; i++){
            c[i]=a[i]+b[i];
        }
        System.out.println((System.currentTimeMillis()-time)/1000.0);
        ArrayList<Integer> x = new ArrayList<>();
        ArrayList<Integer> y = new ArrayList<>();
        ArrayList<Integer> z = new ArrayList<>();
        for(int i=0; i<10000000; i++){
            x.add(rand.nextInt());
            y.add(rand.nextInt());
        }
        long tim = System.currentTimeMillis();
        for(int i=0; i<10000000; i++){
            z.add(x.get(i)+y.get(i));
        }
        System.out.println((System.currentTimeMillis()-tim)/1000.0);
        System.out.println(Integer.MAX_VALUE);
        
    }
}
