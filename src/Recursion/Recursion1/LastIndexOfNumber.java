package Recursion.Recursion1;

public class LastIndexOfNumber {
    public static int lastIndex(int input[], int x) {
        return helper(input, input.length-1, x);
    }

    static int helper(int[] input, int index, int x) {
        if (index<0) return -1;
        if (input[index]==x) return index;

        return helper(input, index-1, x);

    }
}
