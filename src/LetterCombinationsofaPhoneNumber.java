import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class LetterCombinationsofaPhoneNumber {
    public List<String> letterCombinations(String digits) {
        if (digits.length() == 0) return new ArrayList<>();

        Map<Character, String> map = Map.of(
                '2', "abc", '3', "def", '4', "ghi", '5', "jkl",
                '6', "mno", '7', "pqrs", '8', "tuv", '9', "wxyz"
        );

        List<String> res = new ArrayList<>();
        backtrack(digits, 0, new StringBuilder(), map, res);
        return res;
    };

    void backtrack(String digits, int index, StringBuilder path, Map<Character, String> map, List<String> res) {
        if (index == digits.length()) {
            res.add(path.toString()); // đã đủ độ dài, thêm vào kết quả
            return;
        }

        String letters = map.get(digits.charAt(index)); // lấy chuỗi chữ cái của số hiện tại
        for (char c : letters.toCharArray()) {
            path.append(c);                   // chọn một chữ
            backtrack(digits, index + 1, path, map, res); // đi tiếp tới số tiếp theo
            path.deleteCharAt(path.length() - 1);         // xoá chữ vừa thêm (backtrack)
        }
    };

    public static void main(String[] args) {
        LetterCombinationsofaPhoneNumber solution = new LetterCombinationsofaPhoneNumber();
        String digits = "23";
        List<String> combinations = solution.letterCombinations(digits);
        System.out.println(combinations); // Output: [ad, ae, af, bd, be, bf, cd, ce, cf]
    }
}
