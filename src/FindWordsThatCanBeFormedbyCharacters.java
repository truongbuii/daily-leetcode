public class FindWordsThatCanBeFormedbyCharacters {
    public static int countCharacters(String[] words, String chars) {
        int[] map = new int[26];
        int res = 0;

        for (int i = 0; i < chars.length(); i++) {
            map[chars.charAt(i) - 'a']++;
        }

        for (String w : words) {
            int[] tempMap = map.clone();
            boolean flag = true;
            for (int i = 0; i < w.length(); i++) {
                if (tempMap[w.charAt(i) - 'a'] == 0) {
                    flag = false;
                    break;
                } else {
                    tempMap[w.charAt(i) - 'a']--;
                }
            }
            if (flag) res += w.length();
        }
        return res;
    }

    public static void main(String[] args) {
        String[] words = new String[]{"cat","bt","hat","tree"};
        System.out.println(countCharacters(words, "atach"));
    }
}
