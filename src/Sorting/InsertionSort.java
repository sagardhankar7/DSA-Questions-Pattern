package Sorting;

// Leverage in Partially sorted data (it donot scan/ it skips)
public class InsertionSort {
    public static void sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
//            from i onwards - array is unsorted(assume)
            int key = arr[i];
            int j = i-1;
            while(j>=0 && arr[j] > key) {
                arr[j+1] = arr[j];
                j--;
            }

            arr[j+1] = key;

        }
    }


    static void main() {
        int[] arr = {1,8,5,2};
        sort(arr);
        print(arr);
    }

    static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }


}
