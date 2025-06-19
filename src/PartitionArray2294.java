public class PartitionArray2294 {
    public static int partitionArray(int[] nums, int k) {
        int MAX = 100001;
        int[] freq = new int[MAX];

        for (int num : nums) {
            freq[num]++;
        }

        int count = 0;

        for (int i = 0; i < freq.length;) {
            if (freq[i] == 0) {
                i++;
                continue;
            }

            count++;

            for (int j = i; j < freq.length && j <= i + k; j++) {
                freq[j] = 0;
            }

            i = i + k + 1;
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{2,2,4,5};
        System.out.println(partitionArray(nums, 0));
    }
}
