package string;//find the given string is palindrome or not

public class StringPali {
    public static void main(String[] args) {
        String a = "madam";
        char[] chars = a.toCharArray();
        boolean isPalindrome = true;

        for (int i = 0; i < chars.length / 2; i++) {
            if (chars[i] != chars[chars.length - i - 1]) {
                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome) {
            System.out.println(a + " is a palindrome.");
        } else {
            System.out.println(a + " is not a palindrome.");
        }
    }
}