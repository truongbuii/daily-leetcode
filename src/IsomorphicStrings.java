public class IsomorphicStrings {

    public static boolean isIsomorphic(String s, String t) {
        int lenS = s.length();
        if (lenS != t.length()) {
            return false;
        }

        int[] indexS = new int[200];
        int[] indexT = new int[200];

        for (int i = 0; i < lenS; i++) {
            if (indexS[s.charAt(i)] != indexT[t.charAt(i)]) {
                return false;
            }
            indexS[s.charAt(i)] = i + 1;
            indexT[t.charAt(i)] = i + 1;
        }
        return true;
    }


    public static void main(String[] args) {
        System.out.println(isIsomorphic("egg", "bar"));
    }
}





