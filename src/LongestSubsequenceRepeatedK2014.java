import java.util.LinkedList;
import java.util.Queue;

public class LongestSubsequenceRepeatedK2014 {
    public static String longestSubsequenceRepeatedK(String s, int k) {
        String rs = "";
        Queue<String> q = new LinkedList<>();
        for (q.add(""); !q.isEmpty();) {
            String c = q.poll();
            for (char ch = 'a'; ch <= 'z'; ch++) {
                String n = c + ch;
                if (isK(n, s, k)) {
                    rs = n;
                    q.add(n);
                }
            }
        }
        return rs;
    }

    static boolean isK(String s, String t, int k) {
        int c = 0, i = 0;
        for (char ch : t.toCharArray()) {
            if (ch == s.charAt(i)) {
                if (++i == s.length()) {
                    i = 0;
                    if (++c == k)
                        return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String s = "letsleetcode";
        System.out.println(longestSubsequenceRepeatedK(s, 2));
    }
}
