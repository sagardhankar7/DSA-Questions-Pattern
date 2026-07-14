package TwoPointer;

public class KDiffPairs {
    static void main() {
//        Given sorted array
//        Diff should be k between pair items
        int[] arr = {1,3,5,7,10};
        int k = 2;
        int count=0;

        int a = 0;
        int b=1;
        while(b<arr.length && a<b) {
            if (a==b) b++;
            if (arr[b]-arr[a]<k) b++;
            else if (arr[b]-arr[a] > k) a++;
            else{
                count++;
                b++;
            }
        }

        System.out.println(count);
    }
}
