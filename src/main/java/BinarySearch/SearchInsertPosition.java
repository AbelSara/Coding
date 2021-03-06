package BinarySearch;

/**
 * @author Honghan Zhu
 * @leetcode 35
 * @grade easy
 */
public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        int start = 0, end = nums.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (target <= nums[mid]) end = mid - 1;
            else start = mid + 1;
        }
        return start;
    }
}
