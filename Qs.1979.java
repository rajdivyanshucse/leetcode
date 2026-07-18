// 1979. Find Greatest Common Divisor of Array

class Solution {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;

        int grt = nums[n-1];
        int lst = nums[0];

        while (lst != 0) {
            int temp = lst;
            lst = grt % lst;
            grt = temp;
        }
        
        return grt;
    }
}