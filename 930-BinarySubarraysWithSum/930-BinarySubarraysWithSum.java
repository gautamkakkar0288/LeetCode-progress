// Last updated: 16/11/2026, 12:50:47
class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        return atMost(nums,goal)-atMost(nums,goal-1);
    }

    private int atMost(int[] nums, int goal) {
        int left = 0;
        int ans = 0;
        int sum = 0;
        if (goal < 0)
            return 0;
        for (int right = 0; right < nums.length; right++) {
            sum += nums[right];
            while (sum > goal) {
                sum -= nums[left];
                left++;
            }
            ans += right - left + 1;
        }
        return ans;

    }
}
