class Solution {
    public int[] decrypt(int[] code, int k) {
        int n = code.length;
        int[] result = new int[n];

        if (k == 0) return result; // all zeros

        if (k > 0) {
            // Sliding window for next k elements
            int sum = 0;
            for (int j = 1; j <= k; j++) sum += code[j % n];

            for (int i = 0; i < n; i++) {
                result[i] = sum;
                sum -= code[(i + 1) % n];      // outgoing
                sum += code[(i + k + 1) % n];  // incoming
            }
        } else {
            // k < 0 → sum of previous |k| elements
            int m = -k;
            for (int i = 0; i < n; i++) {
                int sum = 0;
                for (int j = 1; j <= m; j++) {
                    sum += code[(i - j + n) % n];
                }
                result[i] = sum;
            }
        }

        return result;
    }
}
