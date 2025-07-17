public class DivideTwoIntegers29 {
    public static int divide(int dividend, int divisor) {
        if(dividend == divisor) return 1;
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }
        if(divisor == 1) return dividend;
        if(dividend == -1) return -dividend;
        int sign = 1;
        if(dividend>0 && divisor<0) sign = -1;
        if(dividend<0 && divisor>0) sign = -1;

        long ded = Math.abs((long) dividend);
        long dr = Math.abs((long) divisor);

        int res = 0;

        while (ded >= dr) {
            int p = 0;
            while (ded >= dr<<p) {
                p++;

                p--;
                ded -= dr << p;
                res += 1 << p;
            }
        }
        if (res >= Math.pow(2, 31) && sign == 1) return Integer.MAX_VALUE;
        if (res <= -Math.pow(2, 31) && sign == -1) return Integer.MIN_VALUE;

        return res * sign;
    }

    public static void main(String[] args) {
        System.out.println(divide(10, 3)); // Output: 3
    }
}
