// Last updated: 16/11/2026, 12:50:59
class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length())
        return false;
        return (s+s).contains(goal);
        
    }
}