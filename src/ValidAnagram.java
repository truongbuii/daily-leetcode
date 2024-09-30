import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {

    // Sorting
    public static boolean isAnagramSort(String s, String t) {
        char[] charS = s.toCharArray();
        char[] charT = t.toCharArray();

        Arrays.sort(charS);
        Arrays.sort(charT);

        return Arrays.equals(charS, charT);
    }

    // HashMap
    public static boolean isAnagramMap(String s, String t) {
        Map<Character, Integer> map = new HashMap<>();
        for (char x : s.toCharArray()) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }
        for (char x : t.toCharArray()) {
            map.put(x, map.getOrDefault(x, 0) - 1);
        }
        for (int val : map.values()) {
            if (val != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isAnagramMap("car", "race"));
    }
}
