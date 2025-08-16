public class Maximum69Number1323 {

    public static int maximum69Number (int num) {
        int temp = num;
        int index = -1;
        int pos = 0;

        while (temp > 0) {
            if (temp % 10 == 6) index = pos;
            temp /= 10;
            pos++;
        }

        return (index == 1) ? num : num + 3 * (int) Math.pow(10, index);
    }

    public static void main(String[] args) {
        int num = 9669;
        int result = maximum69Number(num);
        System.out.println("Maximum number after changing one 6 to 9: " + result); // Output: 9969
    }
}
