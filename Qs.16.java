// 16. 3Sum Closest
import java.util.*;
class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int n = nums.length;
        int closest = 0;
        int mindiff = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            int j = i+1;
            int k = n-1;
            while (j < k) {
                int sum = nums[i]+nums[j]+nums[k];
                if(sum == target){
                    return target;
                }
                if(sum < target){
                    j++;
                }else{
                    k--;
                }
                int diffbtw = Math.abs(target - sum);
                if(diffbtw<mindiff){
                    mindiff = diffbtw;
                    closest = sum;
                }
            }
        }

        return closest;
    }
}
