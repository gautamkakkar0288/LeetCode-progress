// Last updated: 20/08/2026, 02:01:27
class Solution {
    public int numberOfSubstrings(String s) {
        int n=s.length();
        int c=0;
        int[] ls={-1,-1,-1};
        for(int i=0;i<n;i++){
            int ch=s.charAt(i)-'a';
            ls[ch]=i;
            if(ls[0]!=-1&& ls[1]!=-1&& ls[2]!=-1){
                c+=Math.min(ls[0],Math.min(ls[1],ls[2]))+1;
            }

        }
        return c;
        
    }
}