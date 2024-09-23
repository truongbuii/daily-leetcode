import java.util.Arrays;
import java.util.stream.IntStream;

public class MedianOfTwoSortedArrays {

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] merged = IntStream.concat(Arrays.stream(nums1), Arrays.stream(nums2))
                .toArray();
        Arrays.sort(merged);
        int n = merged.length;
        int left = 0;
        int right = 0;
        if (n % 2 == 0) {
            left = (n/2) - 1;
            right = (n/2);
            return (double) (merged[left] + merged[right])/2;
        } else {
            return merged[n/2];
        }
    }


    public static void main(String[] args) {
        int[] nums1 = {1, 3};
        int[] nums2 = {2};
        System.out.println(findMedianSortedArrays(nums1, nums2));
    }

}
