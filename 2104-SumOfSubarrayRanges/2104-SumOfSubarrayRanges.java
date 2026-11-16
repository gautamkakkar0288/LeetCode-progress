// Last updated: 16/11/2026, 12:49:54
class Solution {
    public long subArrayRanges(int[] nums) {
        return sumMax(nums)-sumMin(nums);
        
    }
     private long sumMax(int[] nums){
        int n=nums.length;
        Stack<Integer> st=new Stack<>();
        long ans=0;
        for(int i=0;i<=n;i++){
            while(!st.isEmpty() && (i==n || nums[st.peek()]<nums[i])){
                int mid=st.pop();
                int left=st.isEmpty()?-1:st.peek();
                int right=i;
                ans+=(long)nums[mid]*(mid-left)*(right-mid);
            }
            st.push(i);
        }
        return ans;
    }
     private long sumMin(int[] nums){
        int n=nums.length;
        Stack<Integer> st=new Stack<>();
        long ans=0;
        for(int i=0;i<=n;i++){
            while(!st.isEmpty() && (i==n || nums[st.peek()]>nums[i])){
                int mid=st.pop();
                int left=st.isEmpty()?-1:st.peek();
                int right=i;
                ans+=(long)nums[mid]*(mid-left)*(right-mid);
            }
            st.push(i);
        }
        return ans;

    }
}