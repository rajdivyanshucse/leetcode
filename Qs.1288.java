// 1288. Remove Covered Intervals
import java.util.*;
class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> {
            if(a[0]==b[0]){
                return b[1]-a[1];
            }
            return a[0]-b[0];
        });
        int n = intervals.length;
        int remove = 0;
        int prev = 0;
        for(int i=1;i<n;i++){
            int start = intervals[i][0];
            int end = intervals[i][1];
            int pStart = intervals[prev][0];
            int pEnd = intervals[prev][1];
            if(start>=pStart && end<=pEnd){
                remove++;
            }else{
                prev =i;
            }
            
        }
        return n-remove;
    }
}