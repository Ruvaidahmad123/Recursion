class Solution {
    public int solve(int i,int j,String text1,String text2,int dp[][]){
        if(i<0 || j<0){
            return 0;
        }
        if(dp[i][j]!=-1)return dp[i][j];
        if(text1.charAt(i)==text2.charAt(j)){
            return dp[i][j]= 1+solve(i-1,j-1,text1,text2,dp);
        }
        return dp[i][j]=0+Math.max(solve(i-1,j,text1,text2,dp),solve(i,j-1,text1,text2,dp));
    }
    public int longestCommonSubsequence(String text1, String text2) {
        int n1=text1.length();
        int n2=text2.length();
        int dp[][]=new int[n1][n2];
        for(int rows[]:dp){
            Arrays.fill(rows,-1);
        }
        return solve(n1-1,n2-1,text1,text2,dp);
    }
}