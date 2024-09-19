public class LengthOfLastWord {
    public static int lengthOfLastWord(String s) {
        s = s.trim();
        int n = s.length() - 1;
        int count = 0;
        for (int i = n; i >= 0; i--) {
            if (s.charAt(i) == ' ') {
                return count;
            }
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("   fly me   to   the moon  "));
    }
}
