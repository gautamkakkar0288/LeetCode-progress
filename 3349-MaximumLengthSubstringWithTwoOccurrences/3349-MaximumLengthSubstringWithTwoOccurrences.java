// Last updated: 14/08/2026, 20:55:10
class Solution {
    public int maximumLengthSubstring(String s) {
        StringBuffer str=new StringBuffer(s);
        HashMap<Character,Integer> mpp=new HashMap<>();
        int left=0;
        int ans=0;
        for(int right=0;right<s.length();right++){
            char ch=s.charAt(right);
            mpp.put(ch,mpp.getOrDefault(ch,0)+1);
            while(mpp.get(ch)>2){
                char leftch=s.charAt(left);
                mpp.put(leftch,mpp.get(leftch)-1);
                left++;

            }
            ans=Math.max(ans,right-left+1);
        }
        return ans;
        
    }
}