package Recursion.Recursion2;

import java.util.ArrayList;
import java.util.List;

public class GetStairPath {
    static void main() {
        solve(7, "");
    }

//    We have multiple path-But we have same destination to achieve
    static void solve(int n, String ans) {
        if (n<0) return;

        if (n==0) {
            System.out.println(ans);
        }

        solve(n-1, ans+"1");
        solve(n-2, ans+"2");
        solve(n-3, ans+"3");


    }
}
