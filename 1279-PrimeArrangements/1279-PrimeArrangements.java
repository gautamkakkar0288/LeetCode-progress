// Last updated: 03/08/2026, 21:08:44
class Solution {
            static final int MOD=1_000_000_007;

    public int numPrimeArrangements(int n) {
        boolean[] prime=new boolean[n+1];
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
        int primeCount=0;
        for(int i=2;i<=n;i++) {
            if(prime[i]) primeCount++;
        }
        long ans=fact(primeCount);
        ans=(ans*fact(n-primeCount))%MOD;
        return (int) ans;
    }
    private long fact(int n){
        long fact=1;
        for(int i=2;i<=n;i++)
        {
            fact=(fact*i)%MOD;
        }
        return fact;
    }

}