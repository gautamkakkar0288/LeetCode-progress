// Last updated: 16/11/2026, 12:50:11
class Solution {
    public int maxDepth(String s) {
        int depth=0;
        int maxDepth=0;
        for(char ch:s.toCharArray()){
            if(ch=='('){
            depth++;
            maxDepth=Math.max(maxDepth,depth);
        }
        if(ch==')'){
            depth--;
        }
        }
        return maxDepth;
        
    }
}