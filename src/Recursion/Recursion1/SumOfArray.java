package Recursion.Recursion1;

public class SumOfArray {
    public static int sum(int input[]) {
        return helper(input, 0, 0);
    }
    static int helper(int [] input, int index, int sum) {
        if(index==input.length) return sum;

        return helper(input,index+1, sum+input[index]);
    }
}
