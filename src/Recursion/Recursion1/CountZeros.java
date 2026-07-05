package Recursion.Recursion1;

public class CountZeros {
    public static int countZerosRec(int input){
        if (input==0) return 1;
        return helper(input);
    }

    static int helper(int input) {
        if (input==0) return 0;
        int rem = input%10;

        input=input/10;
        if (rem==0) {
            return 1+ helper(input);
        }
        return helper(input);
    }
}
