import java.util.Stack;

public class UsingARobot2434 {

    public static String robotWithString(String s) {
        // Count frequency of each character
        int[] freq = new int[26];
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }

        Stack<Character> stack = new Stack<>();
        StringBuilder result = new StringBuilder();
        char minChar = 'a'; // Initialize the minimum character to 'a'

        for (char c : s.toCharArray()) {
            // Push the current character onto the stack
            stack.push(c);
            // Decrease the frequency of the current character
            freq[c - 'a']--;

            // Update the minimum character if necessary
            while (minChar < 'z' && freq[minChar - 'a'] == 0) {
                minChar++;
            }

            // Pop characters from the stack to result if they are less than or equal to minChar
            while (!stack.isEmpty() && stack.peek() <= minChar) {
                result.append(stack.pop());
            }
        }

        // Append any remaining characters in the stack to the result
        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }

        return result.toString();
    }

    public static void main(String[] args) {

        String s = "bdda";
        String result = robotWithString(s);
        System.out.println(result); // Expected output: "abc"
    }
}
