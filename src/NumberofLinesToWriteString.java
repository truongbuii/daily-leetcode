import java.util.Arrays;

public class NumberofLinesToWriteString {

    public static int[] numberOfLines(int[] widths, String s) {
        int sum = 0, line = 1;
        for (char c : s.toCharArray()) {
            int index = c - 'a';
            if (sum + widths[index] > 100) {
                line++;
                sum = 0;
            }
            sum += widths[index];
        }
        return new int[]{line, sum};
    }
    public static void main(String[] args) {
        int[] widths = new int[]{4,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10};
        String s = "bbbcccdddaaa";
        System.out.println(Arrays.toString(numberOfLines(widths, s)));
    }
}
