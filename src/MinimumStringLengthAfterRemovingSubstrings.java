import java.util.Stack;

public class MinimumStringLengthAfterRemovingSubstrings {

    /*
        + Reading the string from left to right, we evaluate each character
         => deciding whether to add it to the stack or remove a prior character.
         - If the stack isn’t empty, we compare the current character with the one at the top of the stack.
         - If they form a pattern like "AB" or "CD," removing both current char and pop the stack.
         - If no pattern is formed, simply push the current character onto the stack.
     */
    public static int minLength(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char current_char = s.charAt(i);

            if (stack.isEmpty()) {
                stack.push(current_char);
                continue;
            }

            if (current_char == 'B' && stack.peek() == 'A') {
                stack.pop();
            } else if (current_char == 'D' && stack.peek() == 'C') {
                stack.pop();
            } else {
                stack.push(current_char);
            }
        }
        return stack.size();
    }

    public static void main(String[] args) {
        System.out.println(minLength("ABFCACDB"));
    }
}
