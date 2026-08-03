// Last updated: 03/08/2026, 21:08:55
class Solution {

    public int sumSubarrayMins(int[] arr) {

        int n = arr.length;
        int[] pse = pse(arr);
        int[] nse = nse(arr);

        long ans = 0;
        int mod = 1000000007;

        for (int i = 0; i < n; i++) {
            long left = i - pse[i];
            long right = nse[i] - i;

            ans = (ans + (left * right * arr[i]) % mod) % mod;
        }

        return (int) ans;
    }

    private int[] pse(int[] arr) {

        int n = arr.length;
        int[] pse = new int[n];
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < n; i++) {

            while (!st.isEmpty() && arr[st.peek()] > arr[i]) {
                st.pop();
            }

            pse[i] = st.isEmpty() ? -1 : st.peek();

            st.push(i);
        }

        return pse;
    }

    private int[] nse(int[] arr) {

        int n = arr.length;
        int[] nse = new int[n];
        Stack<Integer> st = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {

            while (!st.isEmpty() && arr[st.peek()] >= arr[i]) {
                st.pop();
            }

            nse[i] = st.isEmpty() ? n : st.peek();

            st.push(i);
        }

        return nse;
    }
}