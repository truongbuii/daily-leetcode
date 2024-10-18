import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindCommonCharacters {
    public static List<String> commonChars(String[] words) {
        List<String> l = new ArrayList<>();
        Map<Character, Integer> map = freqMap(words[0]);

        for (int i = 1; i < words.length; i++) {
            Map<Character, Integer> curMap = freqMap(words[i]);

            for (char c : map.keySet()) {
                if (curMap.containsKey(c)) {
                    map.put(c, Math.min(map.get(c), curMap.get(c)));
                } else {
                    map.put(c, 0);
                }
            }
        }

        for (char c : map.keySet()) {
            int count = map.get(c);
            for (int i = 0; i < count; i++) {
                l.add(String.valueOf(c));
            }
        }
        return l;
    }

    private static Map<Character, Integer> freqMap (String w) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < w.length(); i++) {
            map.put(w.charAt(i), map.getOrDefault(w.charAt(i), 0) + 1);
        }
        return map;
    }

    public static void main(String[] args) {
        System.out.println(commonChars(new String[]{"bella","label","roller"}));
    }
}
