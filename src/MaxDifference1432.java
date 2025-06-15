public class MaxDifference1432 {

    public static int maxDiff(int num) {
        // Convert the number to a string to manipulate its digits
        String numStr = String.valueOf(num);
        StringBuilder maxStr = new StringBuilder(numStr);
        StringBuilder minStr = new StringBuilder(numStr);

        char maxDigit = ' ';
        for (int i = 0; i < numStr.length(); i++) {
            if (maxStr.charAt(i) != '9') {
                maxDigit = numStr.charAt(i);
                break;
            }
        }

        if (maxDigit != ' ') {
            for (int i = 0; i < numStr.length(); i++) {
                if (numStr.charAt(i) == maxDigit) {
                    maxStr.setCharAt(i, '9');
                }
            }
        }

        char minDigit = numStr.charAt(0);
        char replace = '1';

        if (minDigit == '1') {
            for (int i = 1; i < numStr.length(); i++) {
                if (numStr.charAt(i) != '0' && numStr.charAt(i) != '1') {
                    minDigit = numStr.charAt(i);
                    replace = '0';
                    break;
                }
            }
        }

        for (int i = 0; i < minStr.length(); i++) {
            if (minStr.charAt(i) == minDigit) {
                minStr.setCharAt(i, replace);
            }
        }

        int maxVal = Integer.parseInt(maxStr.toString());
        int minVal = Integer.parseInt(minStr.toString());

        return maxVal - minVal;
    }

    public static void main(String[] args) {
        int num = 9;
        int result = maxDiff(num);
        System.out.println("The maximum difference for " + num + " is: " + result);
    }
}
