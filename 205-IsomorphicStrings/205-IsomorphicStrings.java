// Last updated: 27/08/2026, 15:19:07
class Solution {
    public boolean isIsomorphic(String s, String t) {
        int[] mpp1=new int[256];
        int[] mpp2=new int[256];
        for(int i=0;i<s.length();i++){
            char c1=s.charAt(i);
            char c2=t.charAt(i);

            if(mpp1[c1]!=mpp2[c2]){
                return false;
            }

            mpp1[c1]=i+1;
            mpp2[c2]=i+1;
        }
        return true;
        
    }
}