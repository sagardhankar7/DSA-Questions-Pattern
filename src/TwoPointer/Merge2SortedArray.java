package TwoPointer;

public class Merge2SortedArray {
    static void main() {

    }

    static int[] merge(int[] arr1, int[] arr2) {
        //Your code goes here
        int p1=0;
        int p2=0;
        int n=arr1.length;
        int m = arr2.length;

        int[] ans = new int[n+m];
        int p = 0;
        while (p1 < n && p2 < m) {
            if (arr1[p1] <= arr2[p2]) {
                ans[p++] = arr1[p1++];
            }
            else ans[p++] = arr2[p2++];
        }
        while (p1 < n) {
            ans[p++] = arr1[p1++];
        }
        while (p2 < m) {
            ans[p++] = arr2[p2++];
        }

        return ans;
    }
}
