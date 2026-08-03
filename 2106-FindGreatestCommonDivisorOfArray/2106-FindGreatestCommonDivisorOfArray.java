// Last updated: 03/08/2026, 21:08:40
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