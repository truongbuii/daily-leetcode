import java.util.*;

public class MinimumIndexSumofTwoLists {
    public static String[] findRestaurant(String[] list1, String[] list2) {
        Map<String, Integer> map = new HashMap<>();
        List<String> res = new ArrayList<>();
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < list1.length; i++) {
            map.put(list1[i], i);
        }
        for (int i = 0; i < list2.length; i++) {
            if (map.containsKey(list2[i])) {
                int sum = i + map.get(list2[i]);
                if (sum < min) {
                    min = sum;
                    res.clear();
                    res.add(list2[i]);
                } else if (sum == min) {
                    res.add(list2[i]);
                }
            }
        }
        return res.toArray(new String[res.size()]);
    }

    public static void main(String[] args) {
        String[] list1 = new String[]{"happy","sad","good"};
        String[] list2 = new String[]{"sad","happy","good"};
        System.out.println(Arrays.toString(findRestaurant(list1, list2)));
    }

}
