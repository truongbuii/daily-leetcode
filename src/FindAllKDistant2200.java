import java.util.ArrayList;
import java.util.List;

public class FindAllKDistant2200 {
    // Brute force
    public static List<Integer> findKDistantIndicesBruteForce(int[] nums, int key, int k) {
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

    // Brute force
    public static List<Integer> findKDistantIndicesOnePass(int[] nums, int key, int k) {
        List<Integer> rs = new ArrayList<>();
        int r = 0;
        int n = nums.length;
            for (int j = 0; j < n; j++) {
                if (nums[j] == key ) {
                    int l = Math.max(r, j - k);
                    r = Math.min(n - 1, j + k);
                    for (int i = l; i <= r; ++i) {
                        rs.add(i);
                    }
                }
            }

        return rs;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{3,4,9,1,3,9,5};
        System.out.println(findKDistantIndicesOnePass(nums, 9, 1));
    }
}
