package SearchingAndSorting;


public class Main {
    Main2 obj = new Main2();

    public void print(int[] arr) {
        for (int n : arr) {
            System.out.print(n + " ");
            System.out.println(obj.greet());
        }
        System.out.println();
    }
    
}
