// Last updated: 20/08/2026, 02:01:48
class Solution {
    public int characterReplacement(String s, int k) {
        int[] freq=new int[26];
        int left=0;
        int ans=0;
        int maxF=0;
        for(int right=0;right<s.length();right++){
            int ch=s.charAt(right)-'A';
            freq[ch]++;
            maxF=Math.max(maxF,freq[ch]);
            while((right-left+1)-maxF>k){
                freq[s.charAt(left)-'A']--;
                left++;

            }
            ans=Math.max(right-left+1,ans);
        }
        return ans;

        
    }
}