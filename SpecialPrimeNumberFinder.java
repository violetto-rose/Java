public class SpecialPrimeNumberFinder {
    private static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static int findPrime(int[] arr, int arrayLength) {
        for (int i = 0; i < arrayLength; i++) {
            if (isPrime(arr[i])) {
                for (int j = 0; j < arrayLength; j++) {
                    for (int k = j; k < arrayLength; k++) {
                        if (arr[j] + arr[k] == arr[i]) {
                            return i;
                        }
                    }
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] test1 = {10, 3, 7, 4, 5, 8};
        int[] test2 = {2, 4, 6, 8, 12};
        int[] test3 = {1, 2, 3, 4, 5, 6, 7};

        System.out.println("Test 1 result: " + findPrime(test1, test1.length));
        System.out.println("Test 2 result: " + findPrime(test2, test2.length));
        System.out.println("Test 3 result: " + findPrime(test3, test3.length));
    }
}