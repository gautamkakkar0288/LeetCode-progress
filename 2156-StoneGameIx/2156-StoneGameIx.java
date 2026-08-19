// Last updated: 20/08/2026, 02:01:14
class Solution {
    public boolean stoneGameIX(int[] stones) {
        int [] count=new int[3];
        for(int stone:stones){
            count[stone%3]++;


        }
        if(count[0]%2==0){
            return count[1]>0 && count[2]>0;
        }
        if(count[1]==0 && count[2]==0) return false;

        return Math.abs(count[1]-count[2])>2;
        
    }
}