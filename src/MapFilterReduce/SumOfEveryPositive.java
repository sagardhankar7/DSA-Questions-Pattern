package MapFilterReduce;

import java.util.Arrays;

public class SumOfEveryPositive {
    static void main() {
        int[] integers = {10,20,-1};

        int sum = Arrays.stream(integers).filter((a)->a>0).reduce((a,b)->a+b).orElse(0);
        //orElse is default value
        System.out.println(sum);
    }
}
