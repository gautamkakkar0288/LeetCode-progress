// Last updated: 17/11/2026, 12:57:30
class Solution {
    public boolean repeatedSubstringPattern(String s) {
        String temp= s+s;
        return temp.substring(1,temp.length()-1).contains(s);
    }
}