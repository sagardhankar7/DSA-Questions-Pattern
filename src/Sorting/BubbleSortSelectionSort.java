package Sorting;

public class BubbleSortSelectionSort {
    public static void sort(int[] arr, int size) {
        //Your code goes here
//        for (int i = 1; i < size; i++) {
//            int item = arr[i];
//            int j = i-1;
//            while(arr[j] > item && j>=0) {
//                arr[j+1]=arr[j];
//                j--;
//            }
//            arr[j+1]=item;
//        }

        for (int i = 0; i < size; i++) {
            for (int j = i+1; j < size; j++) {
                if (arr[i] > arr[j]) {
                    swap(arr, i, j);
                }

            }
        }
        print(arr);


    }

    static void main() {
        int[] arr = new int[]{1,8,5,2};
        sort(arr, arr.length);
    }

    static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void swap(int[]arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
