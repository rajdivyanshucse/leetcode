// 3756. Concatenate Non-Zero Digits and Multiply by Sum II
class Solution {
    static final int MOD = 1_000_000_007;
    public int[] sumAndMultiply(String s, int[][] queries) {
        int n = s.length();
        long[] pow10 = new long[n+1];
        pow10[0] = 1;
        for(int i = 1; i<=n; i++){
            pow10[i] = (pow10[i-1]*10) % MOD;
        } 
        long[] prefHash = new long[n+1];
        int[] prefCount = new int[n+1];
        int[] prefSum = new int[n+1];

        for(int i = 0; i<n;i++){
            int d = s.charAt(i) -'0';
            prefCount[i+1] =prefCount[i];
            prefSum[i+1] =prefSum[i];
            prefHash[i+1] = prefHash[i];
            if(d!=0){
                prefCount[i+1]++;
                prefSum[i+1]+=d;
                prefHash[i+1] = (prefHash[i]*10+d)%MOD;
            }
        }
        int[] ans = new int[queries.length];
        for(int i = 0; i<queries.length;i++){
            int l = queries[i][0];
            int r = queries[i][1];
            int sum = prefSum[r+1] - prefSum[l];
            int digits = prefCount[r+1]-prefCount[l];
            long x = prefHash[r+1] - (prefHash[l]*pow10[digits])%MOD+MOD;
            ans[i] = (int)((x*sum)%MOD);
        }
        return ans;
    }
}