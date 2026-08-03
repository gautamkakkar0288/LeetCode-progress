// Last updated: 03/08/2026, 21:09:56
class Solution {
    public int maximalRectangle(char[][] matrix) {
        if(matrix==null) return 0;
        int rows=matrix.length;
        int col=matrix[0].length;
        int maxArea=0;
        int[] height=new int[col];
        for(int i=0;i<rows;i++){
            for(int j=0;j<col;j++){
                if(matrix[i][j]=='1') height[j]++;
                else height[j]=0;
            }
            maxArea=Math.max(maxArea,largestRectangle(height));
        }
        return maxArea;
        
    }

    private static int largestRectangle(int[] height){
        Stack<Integer> st=new Stack<>();
        int maxA=0;
        int n=height.length;
        for(int i=0;i<=n;i++ ){
            while(!st.isEmpty() && (i==n|| height[st.peek()]>height[i])){
                int heights=height[st.pop()];
                int right=i;
                int left=st.isEmpty()?-1:st.peek();
                int width=right-left-1;
                maxA=Math.max(maxA,heights*width);
            }
            st.push(i);
        }
        return maxA;
    }
}