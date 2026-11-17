// Last updated: 17/11/2026, 12:58:37
class Solution {
    public List<String> generateParenthesis(int n) {
        ArrayList<String> ans=new ArrayList<>();
        solve("",0,0,n,ans);
        return ans;
    }

    private void solve(String s , int open, int close, int n, ArrayList<String> ans){
        if(s.length()==2*n)
        ans.add(s);

        if(open<n){
            solve(s+'(',open+1,close,n,ans);
        }

        if(close<open){
            solve(s+')',open,close+1,n,ans);
        }
    }
}