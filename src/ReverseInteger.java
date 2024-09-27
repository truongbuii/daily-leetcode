public class ReverseInteger {
    public static int reverse(int x) {
        int reverse = 0;
        boolean isNegative = x < 0;
        String stringX = String.valueOf(Math.abs(x));
        StringBuilder sb = new StringBuilder(stringX).reverse();

        try {
            reverse = Integer.parseInt(sb.toString());
        } catch (NumberFormatException e) {
            return 0;
        }

        return isNegative ? -reverse : reverse;
    }

    // Solution 2: REMAINDER
    public static int reverseRemainder(int x) {
        int reverse = 0;
        while (x > 0) {
            int digit = x % 10;
            x /= 10;
            if (reverse > Integer.MAX_VALUE / 10 || (reverse == Integer.MAX_VALUE / 10 && digit > 7)) return 0;
            if (reverse < Integer.MIN_VALUE / 10) return 0;
            reverse = reverse * 10 + digit;
        }
        return reverse;
    }

    public static void main(String[] args) {
        System.out.println(reverse(-123));
    }
}
