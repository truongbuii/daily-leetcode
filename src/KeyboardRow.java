import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KeyboardRow {
    /*
     * Define the three rows of the keyboard as strings (s1, s2, s3).
     *  s1 = "qwertyuiop";
     *  s2 = "asdfghjkl";
     *  s3 = "zxcvbnm";
     *
     * For each word in the input array:
     *  + Convert the word to lowercase
     *  + Check the first character to determine which row that word should belong to.
     *  + Compare the rest of the characters of the word to ensure they all belong to the same row
     */

    public static String[] findWords(String[] words) {
        String k1 = "qwertyuiop";
        String k2 = "asdfghjkl";
        String k3 = "zxcvbnm";

        List<String> res = new ArrayList<>();

        for (int i = 0; i < words.length; i++) {
            boolean check = true;
            String keyboard = "";

            String[] current_word = words[i].toLowerCase().split("");
            if (k1.contains(current_word[0])) {
                keyboard = k1;
            } else if (k2.contains(current_word[0])) {
                keyboard = k2;
            } else {
                keyboard = k3;
            }

            for (int j = 1; j < current_word.length; j++) {
                if (!keyboard.contains(current_word[j])) {
                    check = false;
                    break;
                }
            }
            if (check) {
                res.add(words[i]);
            }
        }
        return res.toArray(new String[res.size()]);
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(findWords(new String[]{"Hello", "Alaska", "Dad", "Peace"})));
    }

}
