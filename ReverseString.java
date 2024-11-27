class ReverseString {
    public static String reverseStringBuiltIn(String input) {
        return new StringBuilder(input).reverse().toString();
    }

    public static String reverseStringLoop(String input) {
        String S = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            S += input.charAt(i);
        }
        return S;
    }

    public static void main(String[] args) {
        String input = "Hello";
        String reversed = reverseStringBuiltIn(input);
        String reversed2 = reverseStringLoop(input);
        System.out.println(reversed);
        System.out.println(reversed2);
    }
}

