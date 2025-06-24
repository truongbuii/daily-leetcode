import java.util.ArrayList;
import java.util.List;

public class FindAllKDistant2200 {
    // Brute force
    public static List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        List<Integer> rs = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] == key && Math.abs(i - j) <= k) {
                    rs.add(i);
                    break;
                }
            }
        }
        return rs;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{3,4,9,1,3,9,5};
        System.out.println(findKDistantIndices(nums, 9, 1));
    }
}
