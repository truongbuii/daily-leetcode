import java.util.Arrays;

public class DivideIntervalsIntoMinimumNumberofGroups {
    public static int minGroups(int[][] intervals) {
        int n = intervals.length;
        int[] start_tiems = new int[n];
        int[] end_times = new int[n];

        for (int i = 0; i < n; i++) {
            start_tiems[i] = intervals[i][0];
            end_times[i] = intervals[i][1];
        }
        Arrays.sort(start_tiems);
        Arrays.sort(end_times);

        int endtime_idx = 0, group_count = 0;
        for (int s : start_tiems) {
            if (s > end_times[endtime_idx]) {
                endtime_idx++;
            } else {
                group_count++;
            }
        }
        return group_count;
    }

    public static void main(String[] args) {
        int[][] intervals = new int[][]{{5,10}, {6,8}, {1,5}, {2,3}, {1,10}};
        System.out.println(minGroups(intervals));
    }
}
