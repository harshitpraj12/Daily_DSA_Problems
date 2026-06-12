package Array;

public class SwapMethodDemo {
    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 4, 5};
        int [] nums = {1, 2};
        Integer a = 10;
        Integer b = 20;
        swap(a, b);
        System.out.println("a : "+ a+" b : "+ b);
        swap(nums);
        for(int i : nums){
            System.out.print(i+" ");
        }
        reverse(arr);
        for(int i : arr){
            System.out.print(i+" ");
        }
    }

    private static void swap(int[] nums) {
        int temp = nums[0];
        nums[0] = nums[1];
        nums[1] = temp;
    }

    private static void swap(Integer a, Integer b) {
        Integer temp = a;
        a = b;
        b = temp;
    }

    private static void reverse(int[] arr) {
        int a = 0;
        int b = arr.length-1;
        while(a<b){
            int temp = arr[a];
            arr[a] = arr[b];
            arr[b] = temp;
            a++;
            b--;
        }
    }
}
