class Palindrome {
    public static boolean isPalindrome(String input) {
        String reverse = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reverse += input.charAt(i);
        }    
        if (input.equals(reverse)) {
            return true;
        }
        return false;
    }

    public static boolean isPalindrome2(String input) {
        StringBuilder reverse = new StringBuilder(input);
        reverse.reverse();
        return input.equals(reverse.toString());
    }

    public static void main(String[] args) {
        String str = "malayalam";
        System.out.println(isPalindrome(str));
        System.out.println(isPalindrome2(str));
    }
}