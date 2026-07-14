package MapFilterReduce;

import java.util.Arrays;

public class RemoveOccurances {
    static void main() {
        int[] integers = {1,2,3,4,5,6,1,1,1,2};
        int[] ans = Arrays.stream(integers).filter((a)->a!=1).toArray();

        for (int a: ans) System.out.print(a+" ");
    }
}
