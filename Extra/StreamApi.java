import java.util.List;
import java.util.stream.Stream;

public class StreamApi {
    private static List<Long> list2;
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        List<Integer> list = Stream.iterate(1, x->x+1).limit(200000).toList();   
        long end = System.currentTimeMillis();
        System.out.println("Time taken "+ (end-start) +"ms"); 
        
        start = System.currentTimeMillis();
        List<Long> list3 = list.stream().map(StreamApi::fact).toList();
        end = System.currentTimeMillis();
        System.out.println("Time taken iterative "+ (end-start) +"ms"); 
        
        start = System.currentTimeMillis();
        List<Long> list4 = list.parallelStream().map(StreamApi::fact).toList();
        end = System.currentTimeMillis();
        System.out.println("Time taken paraller "+ (end-start) +"ms"); 


    }
    public static long fact(int n){
        long result = 1;
        for(int i = 2; i<=n; i++){
            result*=i;
        }
        return result;
    }
}
