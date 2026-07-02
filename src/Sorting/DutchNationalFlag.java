package Sorting;
// 0 1 2 in one passing
public class DutchNationalFlag {
    public static void sort012(int[] arr, int n){
        //Your code goes here
        int low=0;
        int mid=0;
        int high=n-1;

        while(mid<=high) {
            int color = arr[mid];
            if (color==0) {
                swapIndex(arr, mid, low);
                low++;
                mid++;
            }
            if (color==1) {
                mid++;
            }
            if (color==2) {
                swapIndex(arr, mid,high);
                high--;
            }
        }
    }

    static void swapIndex(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
