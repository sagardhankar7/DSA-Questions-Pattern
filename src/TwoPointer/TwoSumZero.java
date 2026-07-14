package TwoPointer;

public class TwoSumZero {
    static void main() {
        int[] arr = {-3,-2, 1, 3, 4};
        int p1=0;
        int p2=arr.length-1;

        if(arr[p1]>0 || arr[p2]<0) {
            System.out.println("No Pair found");
            return;
        }

        while (p1<p2) {
            if (arr[p1]+arr[p2] == 0) {
                System.out.println("Pair found "+ arr[p1]+ ", "+arr[p2]);
                return;
            }
            else if (arr[p1]+arr[p2] < 0) p1++;
            else p2--;
        }

        System.out.println("no found");
    }
}
