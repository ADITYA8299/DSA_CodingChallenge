import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {

    List<String> list = new ArrayList<>();

    public List<String> generateParenthesis(int n) {
        AllCombinations(n, "", 0, 0);
        return list;
    }

    void AllCombinations(int n, String str, int open, int close) {
        if (str.length() == 2 * n) {
            list.add(str);
            return;
        }

        if (open < n) {
            AllCombinations(n, str + "(", open + 1, close);
        }

        if (close < open) {
            AllCombinations(n, str + ")", open, close + 1);
        }
    }

    // For testing
    public static void main(String[] args) {
        GenerateParentheses gp = new GenerateParentheses();
        int n = 3;
        List<String> result = gp.generateParenthesis(n);

        System.out.println("Valid Parentheses for n = " + n);
        for (String s : result) {
            System.out.println(s);
        }
    }
}
