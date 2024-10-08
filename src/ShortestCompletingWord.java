public class ShortestCompletingWord {
    public static String shortestCompletingWord(String licensePlate, String[] words) {
        int[] licensePlateCount = new int[26];
        for (char c : licensePlate.toCharArray()) {
            if (Character.isAlphabetic(c)) {
                char ch = Character.toLowerCase(c);
                licensePlateCount[ch - 'a']++;
            }
        }
        String ans = null;
        for (String w : words) {
            int[] StringCount = new int[26];
            for (Character c : w.toCharArray()) {
                StringCount[Character.toLowerCase(c - 'a')]++;
            }
            boolean exist = true;
            for (int i = 0; i < 26; i++) {
               if (StringCount[i] < licensePlateCount[i]) {
                   exist = false;
                   break;
               }
            }
            if (exist) {
                ans = (ans == null || w.length() < ans.length() ? w : ans);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(shortestCompletingWord("1s3 456", new String[]{"looks","pest","stew","show"}));
    }
}
