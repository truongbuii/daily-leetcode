import java.util.ArrayList;
import java.util.List;

public class FindWord2942 {

    public static List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> rs = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            if (words[i].indexOf(x) != -1) {
                rs.add(i);
            }
        }

        return rs;
    }

    public static void main(String[] args) {
        String[] words = {"hello", "world", "java", "programming", "example"};
        char x = 'o';

        List<Integer> indices = findWordsContaining(words, x);
        System.out.println("Indices of words containing '" + x + "': " + indices);
    }
}
