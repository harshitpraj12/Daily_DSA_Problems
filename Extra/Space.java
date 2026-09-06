public class Space {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        runtime.gc();
        long before = runtime.totalMemory()-runtime.freeMemory();
        int [] a = new int[10000000];
        System.out.println((runtime.totalMemory()-runtime.freeMemory())-before);
        runtime.gc();
        System.out.println("Test Again");
        runtime.gc();
        long before1 = runtime.totalMemory()-runtime.freeMemory();
        int [] a1 = new int[10000000];
        System.out.println((runtime.totalMemory()-runtime.freeMemory())-before1);
    }
}
