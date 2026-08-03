// Last updated: 03/08/2026, 21:09:02
class Solution {
    public int[] findErrorNums(int[] nums) {
        int dup=-1,miss=-1;
        for (int i=1;i<=nums.length;i++)
        {
            int c=0;
            for (int j=0;j<nums.length;j++)
            {
                if(nums[j]==i)
                c++;
            }
            if(c==2)
            dup=i;
            else if(c==0)
            miss=i;
        }
        return new int[]{dup,miss};

        
    }
}