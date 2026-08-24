// Last updated: 24/08/2026, 14:14:31
class Solution {

    public long findKthSmallest(int[] coins, int k) {
        long left = 1;
        long right = (long) k * coins[0];

        for (int coin : coins) {
            right = Math.min(right, (long) coin * k);
        }

        while (left < right) {
            long mid = left + (right - left) / 2;

            if (count(mid, coins) >= k) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }

    private long count(long x, int[] coins) {
        int n = coins.length;
        long count = 0;

        for (int mask = 1; mask < (1 << n); mask++) {

            long lcm = 1;
            int bits = 0;

            for (int i = 0; i < n; i++) {
                if ((mask & (1 << i)) != 0) {
                    bits++;

                    long g = gcd(lcm, coins[i]);

                    // Avoid overflow
                    if (lcm > x / (coins[i] / g)) {
                        lcm = x + 1;
                        break;
                    }

                    lcm = lcm / g * coins[i];
                }
            }

            if (lcm > x) {
                continue;
            }

            long multiples = x / lcm;

            if (bits % 2 == 1) {
                count += multiples;
            } else {
                count -= multiples;
            }
        }

        return count;
    }

    private long gcd(long a, long b) {
        while (b != 0) {
            long temp = a % b;
            a = b;
            b = temp;
        }

        return a;
    }
}