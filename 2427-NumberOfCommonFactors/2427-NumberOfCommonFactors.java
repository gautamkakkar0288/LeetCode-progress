// Last updated: 16/11/2026, 12:49:42
class Solution {
    public int commonFactors(int a, int b) {
        int gcd=gcd(a,b);
        int count=0;
        for(int i=1;i<=gcd;i++)
        {
            if(gcd%i==0) count++;
        }
        return count;
        
    }
    private int gcd(int a,int b) {
        while(b!=0){
        int temp=b;
        b=a%b;
        a=temp;
        }
        return a;
    }
}