public class ValidPalindrome {

    /**
     * Two pointer, once is from left and the other from right. These two will move towards
     * each other until they meet in the middle of the string.
     * Check the character at the current position of both side. Only compare Letter or Digit.
     * If it's Letter or Digit move pointer to the next (left++ / right--).
     * If the character at left position is not equal with the right once it will return false;
     */

    public static boolean isPalindrome(String s) {
        if (s.isEmpty()) {
            return true;
        }
        int left = 0;
        int right = s.length() - 1;
        while (left <= right) {
            char charLeft = s.charAt(left);
            char charRight = s.charAt(right);
            if (!Character.isLetterOrDigit(charLeft)) {
                left++;
            } else if (!Character.isLetterOrDigit(charRight)) {
                right--;
            } else {
                if (Character.toLowerCase(charLeft) != Character.toLowerCase(charRight)) {
                    return false;
                }
                left++;
                right--;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("race a car"));
    }
}
