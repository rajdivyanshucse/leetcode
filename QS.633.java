// 633. Sum of Square Numbers

class Solution {
    public boolean judgeSquareSum(int c) {
        int sqroot = (int) Math.sqrt(c);
        int arr[] = new int[sqroot+1];
        for(int i = 0;i<=sqroot;i++){
            arr[i] = i;
        }
        int n = arr.length;
        int j = 0; 
        int k = n-1;
        while(j<=k){
        long sum = (long)arr[j]*arr[j] + (long)arr[k]*arr[k];
            if(sum == c){
                return true;
            }else if(sum < c){
                j++;
            }else{
                k--;
            }
        }
        return false;
    }
}