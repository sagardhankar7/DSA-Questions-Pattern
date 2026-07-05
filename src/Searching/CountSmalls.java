package Searching;

public class CountSmalls {
    public static int[] countSOptimized(int n, int m, int []a, int []b) {
        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            for (int j = m-1; j>=0; j--) {
                if (b[j] <= a[i]) {
                    res[i] = j+1;
                    break;
                }
            }
        }
        return res;
    }

    public static int[] countS(int n, int m, int []a, int []b) {
        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (b[j] <= a[i]) res[i]++;
            }
        }

        return res;
    }
}
