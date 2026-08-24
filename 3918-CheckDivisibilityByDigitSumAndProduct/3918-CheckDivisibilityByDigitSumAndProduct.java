// Last updated: 24/08/2026, 14:14:32
class Solution {
    public boolean checkDivisibility(int n) {
        int sum = 0;
        int product = 1;

        int x = n;

        while (x != 0) {
            int digit = x % 10;

            sum += digit;
            product *= digit;

            x /= 10;
        }

        return n % (sum + product) == 0;
    }
}