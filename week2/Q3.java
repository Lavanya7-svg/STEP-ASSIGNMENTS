public class Q3 {
    public static void checkPalindrome(String str) {
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev += str.charAt(i);
        }
        if (str.equals(rev)) {
            System.out.println(str + " is a Palindrome");
        } else {
            System.out.println(str + " is NOT a Palindrome");
        }
    }

    public static void main(String[] args) {
        checkPalindrome("madam");
        checkPalindrome("java");
    }
}
