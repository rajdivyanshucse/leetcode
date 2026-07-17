// 152. Maximum Product Subarray

class Solution {
    public int maxProduct(int[] nums) {
        int n=nums.length;
        int lpro = 1;
        int rpro = 1;
        int ans = nums[0];
        for(int i=0;i<n;i++){
            lpro = lpro == 0? 1: lpro;
            rpro = rpro == 0? 1: rpro;

            lpro *= nums[i];
            rpro *=nums[n-1-i];

            ans = Math.max(ans, Math.max(lpro,rpro));
        }
        return ans;

        
    }
}