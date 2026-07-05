package Recursion.Recursion1;

import java.util.Arrays;

public class CheckNumberInArray {
    public static boolean checkNumberOptimised(int input[], int x) {
        return helper(input, 0, x);
    }

    public static boolean helper(int[] input, int index, int x) {
        if (index==input.length) return false;

        if (input[index]==x) return true;
        index++;
        return helper(input, index, x);
    }

    public static boolean checkNumber(int input[], int x) {
        if (input.length==0) return false;
        if (input[0]==x) return true;

//        it is not feasible to create a new array with len n-1 index 1 to n-1 for every recursion call
        boolean pass = checkNumber(Arrays.copyOfRange(input, 1, input.length), x);
        return pass;
    }
}
