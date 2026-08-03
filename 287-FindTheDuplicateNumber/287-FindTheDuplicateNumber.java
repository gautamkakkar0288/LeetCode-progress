// Last updated: 03/08/2026, 21:09:23
class Solution {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i=0;i<nums.length-1;i++)
        {
            if(nums[i]==nums[i+1])
            return nums[i];

        }
        return -1;
    }
}