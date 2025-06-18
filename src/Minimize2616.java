import java.util.Arrays;

public class Minimize2616 {

    public static int minimizeMax(int[] nums, int p) {
        // 1 1 2 3 7 10
        Arrays.sort(nums);
        int l = 0, r = nums[nums.length - 1] - nums[0];

        while (l < r) {
            int mid = l + (r - l) / 2, pairs = 0;
            for (int i = 1; i < nums.length; i++) {
                if (nums[i] - nums[i - 1] <= mid) {
                    pairs++;
                    i++;
                }
            }
            if (pairs >= p) r = mid;
            else l = mid + 1;
        }

        return l;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{10,1,2,7,1,3};
        System.out.println(minimizeMax(nums, 2));
    }
}
