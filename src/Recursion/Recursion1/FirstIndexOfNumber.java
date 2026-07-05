package Recursion.Recursion1;

public class FirstIndexOfNumber {
    public static int firstIndex(int input[], int x) {
        return helper(input, 0, x);

    }

    static int helper(int[] input, int index, int x) {
        if (index==input.length) return -1;
        if (input[index]==x) return index;

        return helper(input, index+1, x);

    }
}
