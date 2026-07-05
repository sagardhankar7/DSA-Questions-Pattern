package Recursion.Recursion1;

public class PalindromeCheck {
    public static boolean isPalindrome(String str) {
        return helper(str, 0);
    }

    static boolean helper(String str, int index){
        if (index>=str.length()/2) return true;

        int counterIndex = str.length()-1-index;
        if (str.charAt(index) != str.charAt(counterIndex)) return false;

        return helper(str, index+1);
    }
}
