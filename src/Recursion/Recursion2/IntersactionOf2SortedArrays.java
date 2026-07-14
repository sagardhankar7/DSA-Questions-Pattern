package Recursion.Recursion2;

import java.util.ArrayList;
import java.util.List;

public class IntersactionOf2SortedArrays {
    static void main() {
        int[] p = {1, 3, 4, 5, 5, 6, 6, 7};
        int[] q = {2, 5, 6, 6, 7, 8};
//        resuult [] {5, 6, 6, 7}

        List<Integer> result = new ArrayList<>();
        solve(p,q,0,0,result);
        for (Integer i: result) {
            System.out.println(i);
        }
    }



    static void solve(int[] p, int[] q,int a, int b, List<Integer> res) {
        if (a< p.length && b<q.length){}
        else{
            System.out.println(res);
            return;
        }
        if (p[a]<q[b]) solve(p,q,a+1, b, res);
        else if (p[a]>q[b]) solve(p,q, a, b+1, res);
        else {
            res.add(p[a]);
            solve(p, q, a + 1, b + 1, res);
        }
    }
}
