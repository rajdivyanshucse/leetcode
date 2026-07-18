// 3880. Minimum Absolute Difference Between Two Values

class Solution {
    public int minAbsoluteDifference(int[] nums) {
        int n = nums.length;
        int dist = 0;
        int minAbsDist = Integer.MAX_VALUE;
        
        for(int i = 0;i<n;i++){
            for(int j = 0;j<n;j++){
                if(nums[i] == 1 && nums[j] == 2){
                    dist = Math.abs(i-j);
                    minAbsDist = Math.min(minAbsDist,dist);
                }
            }

        }
        return (minAbsDist == Integer.MAX_VALUE) ? -1 : minAbsDist;
    }
}