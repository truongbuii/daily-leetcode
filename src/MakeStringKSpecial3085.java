public class MakeStringKSpecial3085 {
    public static int minimumDeletions(String word, int k) {
        int[] freq = new int[26];
        for (char c : word.toCharArray()) {
            freq[c - 'a']++;
        }

        int res = word.length();

        for (int base : freq) {
            if (base == 0) continue;
            int del = 0;

            for (int f : freq) {
                if (f == 0) continue;
                if (f < base) del += f;
                else if (f > base + k) del += f - (base + k);
            }
            res = Math.min(res, del);
        }
        return res;
    }
    public static void main(String[] args) {
        String word = "aabcaba";
        System.out.println(minimumDeletions(word, 0));
        // 4a 2b 1c
    }
}
