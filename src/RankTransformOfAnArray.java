import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class RankTransformOfAnArray {
    /**
     * First, we need to remove the duplicate value from arr and sort it. Then put it into Map
     * => We will have the Key(value of arr[i]) and the number of it rank.
     * Then we
     */
    public static int[] arrayRankTransform(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] arrSort = Arrays.stream(arr).distinct().sorted().toArray();
        for (int i = 0; i < arrSort.length; i++) {
            map.put(arrSort[i], i + 1);
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = map.get(arr[i]);
        }
        return arr;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(arrayRankTransform(new int[]{37,12,28,9,100,56,80,5,12})));
    }
}
