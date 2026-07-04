// Qs. Unique Middle Element
class Solution {
    public boolean isMiddleElementUnique(int[] nums) {
        int n = nums.length;
        int mid = nums[n / 2];
        int i = 0;
        while (i <= n - 1) {
            if (i != n / 2) {
                if (nums[i] == mid) {
                    return false;
                }
            }
            i++;
        }
        return true;
    }
}