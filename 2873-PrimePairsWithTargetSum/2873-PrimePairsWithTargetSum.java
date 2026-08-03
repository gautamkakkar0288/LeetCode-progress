// Last updated: 03/08/2026, 21:08:28
class Solution {
    public List<List<Integer>> findPrimePairs(int n) {
        List<List<Integer>> ans=new ArrayList<>();
        if(n<4) return ans;
        boolean[] prime=new boolean[n+1];
        // for(int i=0;i<n;i++)
        // {
        //     prime[i]=true;
        // }
        Arrays.fill(prime,true);
        prime[0]=false;
        prime[1]=false;

        for(int i=2;i*i<=n;i++)
        {
            if(prime[i])
            {
                for(int j=i*i;j<=n;j+=i)
                {
                    prime[j]=false;
                }
            }
        }

        for(int i=2;i<=n/2;i++)
        {
            if(prime[i] && prime[n-i])
            ans.add(Arrays.asList(i,n-i));
        }

        return ans;

        
    }
}