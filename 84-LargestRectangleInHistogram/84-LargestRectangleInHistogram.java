// Last updated: 03/08/2026, 21:10:00
class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> st=new Stack<>();
        int n=heights.length;
        int maxA=0;
        for(int i=0;i<=n;i++){
            while(!st.isEmpty() && (i==n || heights[st.peek()]>=heights[i])){
                int height=heights[st.pop()];
                int right=i;
                int left=st.isEmpty()?-1:st.peek();
                int width=right-left-1;
                maxA=Math.max(maxA,height*width);
            }
            st.push(i);
        }
        return maxA;
        
    }
}