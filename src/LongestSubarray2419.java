public class LongestSubarray2419 {

    public static int longestSubarray(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int maxVal = 0;
        for (int num : nums) {
            if (num > maxVal) {
                maxVal = num;
            }
        }

        int maxLen = 0;
        int currentLen = 0;

        for (int num : nums) {
            if (num == maxVal) {
                currentLen++;
            } else {
                maxLen = Math.max(maxLen, currentLen);
                currentLen = 0;
            }
        }

        return Math.max(maxLen, currentLen);
    }


    public static void main(String[] args) {

        int[] nums = {1, 3, 3, 2, 3, 1, 3};
        System.out.println("Length of the longest subarray: " + longestSubarray(nums)); // Output: 4
    }
}
