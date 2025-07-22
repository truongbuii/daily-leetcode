public class MaximumErasureValue1695 {
    public static int maximumUniqueSubarray(int[] nums) {
        int n = nums.length;
        boolean[] seen = new boolean[10001];
        int left = 0;
        int curSum = 0;
        int maxSum = 0;

        for (int right = 0; right < n; right++) {
            while (seen[nums[right]]) {
                curSum -= nums[left];
                seen[nums[left]] = false;
                left++;
            }
            curSum += nums[right];
            seen[nums[right]] = true;
            if (curSum > maxSum) {
                maxSum = curSum;
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        // Example usage
        int[] nums = {5,2,1,2,5,2,1,2,5};
        int result = maximumUniqueSubarray(nums);
        System.out.println("Maximum Unique Subarray Sum: " + result); // Output: 17
    }
}
