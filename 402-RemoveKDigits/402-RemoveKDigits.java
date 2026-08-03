// Last updated: 03/08/2026, 21:09:12
class Solution {
    public String removeKdigits(String num, int k) {
        StringBuffer st=new StringBuffer();
        for(char c:num.toCharArray()){
            while(!st.isEmpty() && k>0 && st.charAt(st.length()-1)>c){
                st.deleteCharAt(st.length()-1);
                k--;
            }
            st.append(c);
        }

        while(k>0 && st.length()>0){
            st.deleteCharAt(st.length()-1);
            k--;
        }

        int i=0;
        while(i<st.length() && st.charAt(i)=='0'){
            i++;
        }
        String ans=st.substring(i);
        return ans.isEmpty()?"0":ans;
        
    }
}