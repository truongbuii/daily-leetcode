public class PowerOfFour342 {
    public static boolean isPowerOfFour(int n) {
        return (n & (n - 1)) == 0 && n % 3 == 1;
    }
    public static void main(String[] args) {
        System.out.println(isPowerOfFour(16)); // true
    }
}
