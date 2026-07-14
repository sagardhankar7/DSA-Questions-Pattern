package Recursion.Recursion1;

public class DigitsSum {
    public static int sumOfDigits(int input){
        return helper(input);
    }

    static int helper(int input) {
        if (input==0) return 0;

        int digit = input%10;
        input = input/10;
        return digit+helper(input);
    }
}
