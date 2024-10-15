public class DeleteColumnstoMakeSorted {
    public static int minDeletionSize(String[] strs) {
        int n = strs[0].length();
        int del = 0;
        for (int i = 0; i < n; i++) {
            char pre = '0';
            for (String str: strs) {
                char cur = str.charAt(i);
                if (pre > cur) {
                    del++;
                    break;
                }
                pre = cur;
            }
        }
        return del;
    }

    public static void main(String[] args) {
        String[] strs = new String[]{"zyx","wvu","tsr"};
        System.out.println(minDeletionSize(strs));
    }
}
