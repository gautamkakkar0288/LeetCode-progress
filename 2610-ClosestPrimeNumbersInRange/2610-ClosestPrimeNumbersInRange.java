// Last updated: 03/08/2026, 21:08:25
class Solution {
    public int[] closestPrimes(int left, int right) {
        boolean [] prime=new boolean[right+1];
        Arrays.fill(prime,true);
        prime[0]=false;
        prime[1]=false;

        for(int i=2;i*i<=right;i++)
        {
            if(prime[i])
            {
                for(int j=i*i;j<=right;j+=i) {
                    prime[j]=false;
                }
            }
        }

        int prev=-1;
        int minDiff=Integer.MAX_VALUE;
        int[] ans={-1,-1};
        for(int i=Math.max(2,left);i<=right;i++)
        {
            if(prime[i]){
            if(prev!=-1 && i-prev<minDiff){
                minDiff=i-prev;
                ans[0]=prev;
                ans[1]=i;
            }
            
            prev=i;
        }
        }
        return ans;
    }
}