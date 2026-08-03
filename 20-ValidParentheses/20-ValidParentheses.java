// Last updated: 03/08/2026, 21:10:23
class Solution {
    public boolean isValid(String s) {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++) {
            if(s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='[')
            st.push(s.charAt(i));
            else {
            if(st.isEmpty()) return false;
            char ch=st.peek();
            if(s.charAt(i)==')' && ch=='(')
            st.pop();
            else if(s.charAt(i)=='}' && ch=='{')
            st.pop();
            else if(s.charAt(i)==']' && ch=='[')
            st.pop();
            else return false;
            }
        }
        return st.isEmpty();
        
    }
}