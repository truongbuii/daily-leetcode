public class LongestPalindromicSubstring {

    /**
     *
     */

    private static String expandFromCenter(String s, int left, int right) {
        while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return s.substring(left + 1, right);
    }


    public static String longestPalindrome(String s) {
        String result = s.substring(0, 1);
        for (int i = 0; i < s.length() - 1; i++) {
            String odd = expandFromCenter(s, i, i);
            String even = expandFromCenter(s, i, i + 1);

            if (result.length() < odd.length()) {
                result = odd;
            }
            if (result.length() < even.length()) {
                result = even;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(longestPalindrome("ccc"));
    }
}
