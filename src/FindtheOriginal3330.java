public class FindtheOriginal3330 {
    public static int possibleStringCount(String word) {
        int n = word.length();
        int count = n;

        for (int i = 1; i < n; i++) {
            if (word.charAt(i) != word.charAt(i - 1)) {
                count--;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String word1 = "abbcccc";
        System.out.println(possibleStringCount(word1));
    }
}
