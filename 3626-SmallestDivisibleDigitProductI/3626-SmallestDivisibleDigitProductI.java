// Last updated: 06/08/2026, 23:25:58
class Solution {
    public int smallestNumber(int n, int t) {
        while(true){
            if(small(n)%t==0)return n;
            n++;
        }
        
    }
    private int small(int n){
        int prod=1;
        int temp=n;
        while(n>0){
            int digit=n%10;
            if(digit==0) return 0;
            prod=prod*digit;
            n=n/10;
        }
        return prod;
    }
}