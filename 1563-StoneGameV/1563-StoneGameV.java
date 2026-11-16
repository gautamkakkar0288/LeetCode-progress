// Last updated: 16/11/2026, 12:50:13
class Solution {
    public int stoneGameV(int[] stoneValue) {
        int n=stoneValue.length;
        int[] prefix=new int[n+1];
        for(int i=0;i<n;i++)
        {
            prefix[i+1]=prefix[i]+stoneValue[i];
        
        }
        int [][] dp=new int[n][n];

        for(int len=2;len<=n;len++){
            for(int i=0;i+len<=n;i++){
                int j=i+len-1;
                for(int k=i;k<j;k++){
                    int leftsum=prefix[k+1]-prefix[i];
                    int rightsum=prefix[j+1]-prefix[k+1];
                    if(leftsum<rightsum){
                        dp[i][j]=Math.max(dp[i][j],leftsum+dp[i][k]);
                    }
                    else if(leftsum>rightsum){
                        dp[i][j]=Math.max(dp[i][j],rightsum+dp[k+1][j]);
                    }
                    else
                    dp[i][j]=Math.max(dp[i][j],leftsum+Math.max(dp[i][k],dp[k+1][j]));
                }
            }
        }
        return dp[0][n-1];
    }
}