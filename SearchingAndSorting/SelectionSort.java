package SearchingAndSorting;

import java.util.Arrays;


/*Just remember 6 keywords:

👉 P – S – I – M – Q – H
(Pronounce it like: “PSIM-QH” 😄)

These stand for:

P → Pick (Selection Sort)

S → Swap (Bubble Sort)

I → Insert (Insertion Sort)

M → Merge (Merge Sort)

Q → Quick Pick Pivot (Quick Sort)

H → Heapify (Heap Sort)

Now, here is the meaning trick 👇👇👇

🎯 ONE-LINE MEMORY TRICK FOR EACH SORT
1️⃣ Selection Sort — “Pick the smallest and place it first.”

Keyword: P → Pick
You always pick the minimum element and put it in correct position.

2️⃣ Bubble Sort — “Swap until big elements go to top.”

Keyword: S → Swap
Keep swapping adjacent elements until the biggest moves to the end like a bubble.

3️⃣ Insertion Sort — “Insert like arranging playing cards.”

Keyword: I → Insert
Take one element and insert it into the correct place in the sorted left part.

4️⃣ Merge Sort — “Divide, divide, merge back sorted.”

Keyword: M → Merge
Always divide in half, sort, and merge sorted parts.

5️⃣ Quick Sort — “Pick pivot and partition around it.”

Keyword: Q → Quick pivot pick
Choose a pivot, put smaller on left, bigger on right → recursively repeat.

6️⃣ Heap Sort — “Convert to heap then remove max.”

Keyword: H → Heapify
Make a max heap, repeatedly remove max and rebuild heap. */


public class SelectionSort {
    public static void main(String[] args) {
        int arr [] = {34, 12, 64, 7, 4, 32, 65, 82, 43, 54};
        System.out.println("Unsorted Array is: "+ Arrays.toString(arr));

        int n = arr.length;
        SSort(arr, 0, n-1);
        System.out.println("Sorted Array is: "+Arrays.toString(arr));
    }

    private static void SSort(int[] arr, int l, int n) {
        for(int i = 0; i<n; i++){
            int min = i;
            for(int j = i+1; j<n; j++){
                if(arr[j]<arr[min]){
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }
}
