// Last updated: 27/08/2026, 15:32:47
class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length())
        return false;
        return (s+s).contains(goal);
        
    }
}