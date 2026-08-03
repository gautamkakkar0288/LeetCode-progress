// Last updated: 03/08/2026, 21:10:22
class Solution {
public:
    int removeDuplicates(vector<int>& nums) {
        if(nums.empty())
        return 0;
        int k=1;
        for (int i=1;i<nums.size();++i)
        {
            if(nums[i]!=nums[k-1])
            {
                nums[k]=nums[i];
                k++;
            }
        }
        return k;
        
    }
};