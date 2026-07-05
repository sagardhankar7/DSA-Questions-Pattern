package Searching;

import java.util.Arrays;

public class SmallestDifferPair {

    public static int smallestDifferencePairOptimize(int[] ar1, int n, int[] ar2, int m) {
        Arrays.sort(ar1);
        Arrays.sort(ar2);

        int a=0,b=0;
        int result = Integer.MAX_VALUE;
        while (a<n&&b<m) {
            int dif = Math.abs(ar1[a]-ar2[b]);
            if (dif<result) result=dif;

            if (ar1[a]<ar2[b]) a++;
            else b++;
        }

        return result;
    }

    public static int smallestDifferencePair(int[] ar1, int n, int[] ar2, int m) {
        int result = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                //ith from ar1 and jth from ar2
                int dif = Math.abs(ar1[i] - ar2[j]);
                if (dif < result) result = dif;
            }
        }
        return result;
    }
}
