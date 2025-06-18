import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DivideArray2966 {
    public static int[][] divideArray(int[] nums, int k) {
        Arrays.sort(nums);
        List<int[]> rs = new ArrayList<>();
        for (int i = 0; i < nums.length ; i+= 3) {
            int a = nums[i];
            int b = nums[i+1];
            int c = nums[i+2];

            if (c - a > k) return new int[0][];

            rs.add(new int[]{a, b, c});
        }
        return rs.toArray(new int[rs.size()][]);
    }

    public static void main(String[] args) {
        int[] nums = new int[]{2,4,2,2,5,2};
        System.out.println(Arrays.deepToString(divideArray(nums, 2)));
    }
}
