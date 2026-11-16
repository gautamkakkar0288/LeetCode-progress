// Last updated: 16/11/2026, 12:50:39
class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder ans=new StringBuilder();
        int depth=0;
        for(char c:s.toCharArray()){
            if(c=='('){
                if(depth>0){
                    ans.append(c);
                }
                depth++;
            }

            if(c==')'){
                depth--;
                if(depth>0){
                    ans.append(c);
                }
            }
        }
        return ans.toString();
        
    }
}