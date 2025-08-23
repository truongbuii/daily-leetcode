import java.util.Arrays;

public class SmallestSubarrays2411 {

    public static int[] smallestSubarrays(int[] nums) {
        int len = nums.length;
        int[] res = new int[len];
        Arrays.fill(res, 1);
        for (int i = 0; i < len; i++) {
            int x = nums[i];
            res[i] = 1;
            int j = i - 1;
            while (j >= 0 && ( (nums[j] | x) != nums[j]) ) {
                res[j] = i - j + 1;
                nums[j] |= x;
                j--;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(smallestSubarrays(new int[]{1,0,2,1,3}))); // [3,3,2,2,1]
    }
}
