import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ShortestDistancetoaCharacter {
    public static int[] shortestToChar(String s, char c) {
        int n = s.length();
        int[] res = new int[n];
        List<Integer> ls = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == c) {
                ls.add(i);
            }
        }
        for (int i = 0; i < n; i++) {
            int minn = Integer.MAX_VALUE;
            for (int j = 0; j < ls.size(); j++) {
                minn = Math.min(minn, Math.abs(i - ls.get(j)));
            }
            res[i] = minn;
        }
        return res;
    }

    public static void main(String[] args) {
        String s = "loveleetcode";
        char c = 'e';
        System.out.println(Arrays.toString(shortestToChar(s, c)));
    }
}
