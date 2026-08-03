// Last updated: 03/08/2026, 21:10:14
class Solution {
    public double myPow(double x, int n) {
        long N=n;
        if(N<0)
        {
            N=-N;
            x=1/x;
        }
        double result=1.0;
        while(N>0)
        {
            if(N%2==1)
            {
                result*=x;
            }
            x*=x;
            N/=2;
        }
        return result;
        
    }
}