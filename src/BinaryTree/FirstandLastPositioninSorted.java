package BinaryTree;

public class FirstandLastPositioninSorted {
    public int[] searchRange(int[] nums, int target) {
        int first = 0;
        int last = nums.length-1;
        //        left position
        int left = 0;
        int right = nums.length-1;
        while (left < right) {
            int mid = (left + right)/2;

            if (nums[mid] == target) right=mid;
            else if (nums[mid]>target) right=mid-1;
            else left = mid + 1;
        }

        first=right;

//        todo: right position
        left = 0;
        right = nums.length-1;
        while (left < right) {
            int mid = (left + right)/2 + 1;

            if (nums[mid] == target) left=mid; // FEAT: INFINITE LOOP
            else if (nums[mid]>target) right=mid-1;
            else left = mid + 1;
        }

        last = left;
        return new int[]{first,last};
    }


    void main() {
        int[] arr = new int[]{1,2,3,5,5,5,10,15};
        int[] result = this.searchRange(arr, 5);
        System.out.println(result[0] + " and " + result[1]);
    }
}
