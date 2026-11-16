// Last updated: 16/11/2026, 12:49:59
class Solution {
    static final long MOD=1000000007;

    public int countGoodNumbers(long n) {
        long even=(n+1)/2;
        long odd=n/2;
        long ans=power(5,even);
        ans=(ans*(power(4,odd)))%MOD;
        return (int)ans;
        
    }

    private long power(long base, long exp){
        if(exp==0)
        return 1;
        long half=power(base,exp/2);

        if(exp%2==0)
        return (half*half)%MOD;

        else 
        return (half*half%MOD*base)%MOD;
    }
}