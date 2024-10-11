import java.util.HashMap;
import java.util.Map;

public class MostCommonWord {

    public static String mostCommonWord(String paragraph, String[] banned) {
        Map<String, Integer> map = new HashMap<>();
        //  Convert paragraph to lowercase and replace all non-alphabetic characters with spaces
        String str = paragraph.toLowerCase().replaceAll("[^a-z]", " ");
        // Remove all the space from paragraph
        String[] words = str.split(" ");

        for (String w : words) {
            if (w.length() > 0) {
                map.put(w, map.getOrDefault(w, 0) + 1);
            }
        }
        // Remove all the word banned from the map
        for (String ban : banned) {
            if (map.containsKey(ban)) {
                map.remove(ban);
            }
        }
        //  Find the word with the highest count
        String ans = "";
        int max = 0;
        for (String w : map.keySet()) {
            int count = map.get(w);
            if (count > max) {
                max = count;
                ans = w;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        String input = "Bob. hIt, baLl";
        String[] banned = new String[]{"bob", "hit"};
        System.out.println(mostCommonWord(input, banned));
    }
}
