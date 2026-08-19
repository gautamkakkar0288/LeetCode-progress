// Last updated: 20/08/2026, 02:01:29
class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        return niceArr(nums,k)-niceArr(nums,k-1);
    }

        private int niceArr(int[] nums,int k){
            int left=0;
            int oddNo=0;
            int ans=0;
            for(int right=0;right<nums.length;right++){
                if(nums[right]%2!=0){
                    oddNo++;
                }
                    while(oddNo>k){
                        if(nums[left]%2!=0)
                        oddNo--;
                        left++;
                    }
                    ans+=right-left+1;

                
            }
            return ans;
        }
        
    }
