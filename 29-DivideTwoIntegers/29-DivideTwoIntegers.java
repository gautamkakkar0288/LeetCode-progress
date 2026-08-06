// Last updated: 07/08/2026, 00:42:17
class Solution {
    public int divide(int dividend, int divisor) {
        if(dividend==Integer.MIN_VALUE && divisor==-1)
        return Integer.MAX_VALUE;

        long dvd=Math.abs((long)dividend);
        long dvs=Math.abs((long)divisor);
        boolean negative=(divisor<0)^(dividend<0);
        int ans=0;
        for(int i=31;i>=0;i--){
            if((dvd>>i)>=dvs){
                ans+=(1<<i);
                dvd-=(dvs<<i);
            }
        }
        return negative?-ans:ans;
    }
}