// Last updated: 16/11/2026, 12:49:02
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