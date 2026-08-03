// Last updated: 03/08/2026, 21:08:42
class Solution {
    public int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);
        int right=0;
        int left=0;
        long sum=0;
        int ans=0;
        for(right=0;right<nums.length;right++) {
            sum+=nums[right];
            while((long)nums[right]*(right-left+1)-sum>k){
                sum-=nums[left];
                left++;
            }
            ans=Math.max(ans,right-left+1);
        }
            return ans;

    }
}