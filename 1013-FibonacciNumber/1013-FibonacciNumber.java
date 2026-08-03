// Last updated: 03/08/2026, 21:08:54
class Solution {
    public int fib(int n) {
        if(n<=1) return n;
        return fib(n-1)+fib(n-2);
        
    }
}