public class MinimumAddtoMakeParenthesesValid {
    /*
     * We got open stand for '(' and clse stand for ')'.
     * We travel in the String
     * If char = '(' => open++.
     * Now if open > 0:
     *  and the char is ')' => open-- because it valid.
     * Else close++
     */

    public static int minAddToMakeValid(String s) {
        int open = 0, close = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                open++;
            } else {
                if (open > 0) {
                    open--;
                } else {
                    close++;
                }
            }
        }
        return open + close;
    }

    public static void main(String[] args) {
        System.out.println(minAddToMakeValid("((("));
    }
}
