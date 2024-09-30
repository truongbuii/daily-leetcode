public class ExcelSheetColumnTitle {
    public static String convertToTitle(int columnNumber) {
        StringBuilder str = new StringBuilder();
        while (columnNumber > 0) {
            int index = (columnNumber - 1) % 26;
            str.insert(0, (char)('A' + index));
            columnNumber = (columnNumber - 1) / 26;
        }
        return str.toString();
    }

    public static int titleToNumber(String columnTitle) {
        int n = columnTitle.length();
        int result = (columnTitle.charAt(0) - 'A') + 1;
        for (int i = 1; i < n; i++ ) {
            result *= 26;
            result += (columnTitle.charAt(i) - 'A') + 1;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(titleToNumber("ZY"));
    }
}
