// 1464. Maximum Product of Two Elements in an Array

import java.util.*;

class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int i = 0; 
        int j = i+1;
        int pro = 0;
        int maxPro = Integer.MIN_VALUE;
        while(i<n-1){
            
            pro = (nums[i]-1)*(nums[j]-1);
            maxPro = Math.max(pro,maxPro);
            j++;
            if(j>n-1){
                i++;
                j=i+1;
            }
        }
        return maxPro;
    }
}