class MaxsizeFunction {
    public static int maxsize(int n, int k, String s) {
        int leadingZeros = 0;
        int trailingZeros = 0;
        int maxMiddleZeros = 0;
        int currentZeros = 0;

        // Count leading zeros
        for (int i = 0; i < n && s.charAt(i) == '0'; i++) {
            leadingZeros++;
        }

        // Count trailing zeros
        for (int i = n - 1; i >= 0 && s.charAt(i) == '0'; i--) {
            trailingZeros++;
        }

        // Find max middle zeros
        for (int i = leadingZeros; i < n - trailingZeros; i++) {
            if (s.charAt(i) == '0') {
                currentZeros++;
            } else {
                if (currentZeros > maxMiddleZeros) {
                    maxMiddleZeros = currentZeros;
                }
                currentZeros = 0;
            }
        }
        if (currentZeros > maxMiddleZeros) {
            maxMiddleZeros = currentZeros;
        }

        int maxZeros;
        if (k == 1) {
            maxZeros = Math.max(leadingZeros, trailingZeros);
            maxZeros = Math.max(maxZeros, maxMiddleZeros);
        } else {
            if (leadingZeros == n) {
                maxZeros = n * k;
            } else {
                maxZeros = leadingZeros + trailingZeros + (k - 1) * n;
                if (maxMiddleZeros > maxZeros) {
                    maxZeros = maxMiddleZeros;
                }
            }
        }

        return maxZeros;
    }

    public static void main(String[] args) {
        Object[][] testCases = {
                { 3, 2, "000" },
                { 6, 3, "110010" },
                { 8, 5, "00100110" }
        };

        for (Object[] testCase : testCases) {
            int n = (int) testCase[0];
            int k = (int) testCase[1];
            String s = (String) testCase[2];
            int result = maxsize(n, k, s);
            System.out.printf("Test Case: (n = %d, k = %d, s = \"%s\") | Result: %d%n", n, k, s, result);
        }
    }
}
