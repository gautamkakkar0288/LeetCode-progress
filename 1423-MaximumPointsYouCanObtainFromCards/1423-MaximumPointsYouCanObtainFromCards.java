// Last updated: 16/11/2026, 12:50:17
class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n=cardPoints.length;
        int total=0;
        for(int i=0;i<n;i++){
            total+=cardPoints[i];
        }

        int window=n-k;
        if(window==0) return total;
        int sum=0;
        for(int i=0;i<window;i++){
            sum+=cardPoints[i];
        }

        int minSum=sum;
        for(int i=window;i<n;i++){
            sum+=cardPoints[i];
            sum-=cardPoints[i-window];
            minSum=Math.min(sum,minSum);
        }
        return total-minSum;
        
    }
}