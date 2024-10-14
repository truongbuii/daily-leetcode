import java.util.Arrays;

public class DIStringMatch {
    public static int[] diStringMatch(String s) {
        int[] result = new int[s.length()+1];
        int min =0;
        int max =s.length();
        int i =0;

        for(i = 0; i < s.length(); i++) {
            result[i] = s.charAt(i) == 'I' ? min++ : max--;
        }
        result[i] = min;
        return result;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(diStringMatch("IDID")));
    }
}
