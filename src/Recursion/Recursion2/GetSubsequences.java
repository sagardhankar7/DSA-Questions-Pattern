package Recursion.Recursion2;

import java.util.ArrayList;
import java.util.List;

public class GetSubsequences {
    static void main() {
        List<String> res = new ArrayList<>();
        res = solve("abc");
        System.out.println(res);
    }

    static List<String> solve(String s) {
        if (s.length()==0) {
            List<String> ans = new ArrayList<>();
            ans.add("");
            return ans;
        }

        List<String> asf = solve(s.substring(1));
        List<String> modifiedans = new ArrayList<>();
        for (String st: asf) {
            String newSt = st+s.charAt(0);
            modifiedans.add(newSt);
        }

        List<String> ans = new ArrayList<>(asf);
        ans.addAll(modifiedans);
        return ans;
    }
}
