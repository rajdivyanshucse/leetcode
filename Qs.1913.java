// 1913. Maximum Product Difference Between Two Pairs

import java.util.*;
class Solution {
    public int maxProductDifference(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int ans = Math.abs((nums[0]*nums[1]) - (nums[n-2]*nums[n-1]));
        return ans;
    }
}