import java.util.TreeMap;

public class MyCalender {

    TreeMap<Integer, Integer> cal;

    public MyCalender() {
        cal = new TreeMap<>();
    }

    public boolean book(int start, int end) {
        /*
         * Get start time that smaller and bigger than start current
         * Ex: cal has [10, 20] [30, 40] and new book is [15, 25]
         * => preStartBook = floorKey(15) = 10 same with nextStartBook = 30
         */
        Integer preStartBook = cal.floorKey(start);
        Integer nextStartBook = cal.ceilingKey(start);
        if (
                (preStartBook == null || cal.get(preStartBook) <= start)
                        && (nextStartBook == null || end <= nextStartBook)
        ) {
            cal.put(start, end);
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        MyCalender myCalender = new MyCalender();
        System.out.println(myCalender.book(10, 20)); // true
        System.out.println(myCalender.book(15, 25)); // false
        System.out.println(myCalender.book(20, 30)); // true
    }
}
