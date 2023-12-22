import java.util.Comparator;
import java.util.PriorityQueue;

public class Solution {
    public int numSubarrayBoundedMax(int[] nums, int left, int right) {
        int count = 0;

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] < left || nums[i] > right){
                continue;
            }
            int start = i;
            int end = i;
            while (start > 0 && nums[start -1] < nums[i]){
                start--;
            }
            while (end < nums.length - 1 && nums[end + 1] <= nums[i]){
                end++;
            }
            count += countSubArrays(end - start + 1, i - start );


        }
        return count;
    }
    private int countSubArrays(int length, int targetIndex) {
        return (targetIndex + 1) * (length - targetIndex);
    }
}
