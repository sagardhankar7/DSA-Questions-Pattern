package Recursion.Recursion1;

public class ValidateSortedArray {
    public static boolean arraySortedOrNot(int []ar, int n) {
        return helper(ar, 1, n);
    }

    static boolean helper(int[] ar, int index, int n) {
        if (index==n) return true;

        if (ar[index-1]<= ar[index]) return helper(ar, index+1, n);
        else return false;

    }
}
