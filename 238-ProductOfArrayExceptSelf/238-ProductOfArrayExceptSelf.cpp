// Last updated: 03/08/2026, 21:09:26
#include <vector>
class Solution {
public:
    std::vector<int> productExceptSelf(vector<int>& nums) {
        int pp=1;
        int n=nums.size();
        std::vector<int>ans(n);
        for (int i=0;i<n;++i)
        {
            ans[i]=pp;
            pp*=nums[i];
        }
        int sp=1;
        for (int i=n-1;i>=0;--i)
        {
            ans[i]*=sp;
            sp*=nums[i];
        }
        return ans;
        
    }
};