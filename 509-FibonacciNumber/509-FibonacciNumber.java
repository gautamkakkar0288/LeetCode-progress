// Last updated: 16/11/2026, 12:50:44
class Solution {
    public int fib(int n) {
        if(n<=1) return n;
        return fib(n-1)+fib(n-2);
        
    }
}