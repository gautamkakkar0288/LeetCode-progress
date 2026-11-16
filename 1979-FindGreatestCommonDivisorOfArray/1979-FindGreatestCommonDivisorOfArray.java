// Last updated: 16/11/2026, 12:49:57
class Solution {
    public int findGCD(int[] nums) {
        int min=nums[0];
        int max=nums[0];
        for(int num: nums) {
            min=Math.min(num,min);
            max=Math.max(num,max);
        }
        return gcd(min,max);
        
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