class Solution {
    public int solve(int coins[],int idx,int target,int dp[][]){
        if(idx==0){
            if(target%coins[0]==0)return target/coins[0];
            else return Integer.MAX_VALUE;
        }
        if(dp[idx][target]!=-1)return dp[idx][target];
        int notpick=solve(coins,idx-1,target,dp);
        int pick=Integer.MAX_VALUE;
        if(target>=coins[idx]){
            int result=solve(coins,idx,target-coins[idx],dp);
            if(result!=Integer.MAX_VALUE){
                pick=1+result;
            }
        }
        return dp[idx][target]=Math.min(pick,notpick);
    }
    public int coinChange(int[] coins, int amount) {
        int n=coins.length;
        int dp[][]=new int[n][amount+1];
        for(int rows[]:dp)Arrays.fill(rows,-1);
        int ans=solve(coins,n-1,amount,dp);
        if(ans==Integer.MAX_VALUE){
            return -1;
        }
        return ans;
    }
}