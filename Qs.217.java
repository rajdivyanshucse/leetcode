// 217. Contains Duplicate

import java.util.*;
class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        int n =nums.length;
        int i = 0;
        while(i!=n-1){
            if(nums[i+1]==nums[i]){
                return true;
            }
            i++;
        }
        return false;
    }
}