import java.util.*;

class Solution {
    public int[] pairWithTargetSum(int[] nums, int target) {
        Arrays.sort(nums);   // Sort the array first
        
        int left = 0;
        int right = nums.length - 1;
        
        while (left < right) {
            int sum = nums[left] + nums[right];
            
            if (sum == target) {
                return new int[]{nums[left], nums[right]};
            }
            else if (sum < target) {
                left++;     // Need bigger sum
            }
            else {
                right--;    // Need smaller sum
            }
        }
        
        return new int[]{-1, -1};  // No pair found
    }
}
