// 41. First Missing Positive

class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        int i = 0;
        while (i < n) {
            int currIdx = nums[i] - 1;
            if (nums[i] > 0 && nums[i] <= n && nums[i] != nums[currIdx]) {

                int temp = nums[i];
                nums[i] = nums[currIdx];
                nums[currIdx] = temp;

            } else {
                i++;
            }
        }
        for(int k = 0;k<n;k++){
            if(nums[k]!= k+1){
                return k+1;
            }
        }
        return n+1;
    }
}