import java.util.Arrays;
import java.util.Comparator;

public class RelativeRanks {
    public static String[] findRelativeRanks(int[] score) {
        int n = score.length;
        int[] sorted = Arrays.copyOf(score, n);
        Arrays.sort(sorted);
        String[] res = new String[n];
        for (int i = 0; i < n; i++) {
            int rank = n - Arrays.binarySearch(sorted, score[i]);
            res[i] = rank == 1 ? "Gold Medal" : rank == 2 ? "Silver Medal" : rank == 3 ? "Bronze Medal" : String.valueOf(rank);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] score = {5, 4, 3, 2, 1};
        System.out.println(Arrays.toString(findRelativeRanks(score)));
    }
}
