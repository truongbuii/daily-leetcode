import java.util.ArrayList;
import java.util.List;

public class StringMatchingInAnArray {
    public static List<String> stringMatching(String[] words) {
        List<String> l = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words.length; j++) {
                if (i != j && words[i].contains(words[j])) {
                    l.add(words[j]);
                    break;
                }
            }
        }
        return l;
    }
    public static void main(String[] args) {
        String[] words = new String[] {"mass","as","hero","superhero"};
        System.out.println(stringMatching(words));
    }
}
