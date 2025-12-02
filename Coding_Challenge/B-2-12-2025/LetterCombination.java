import java.util.*;

public class LetterCombination {

    static List<String> ans = new ArrayList<>();

    public static List<String> letterCombinations(String digits) {
        if (digits == null || digits.length() == 0) return ans; // minimal addition to avoid error

        HashMap<Character, String> map = new HashMap<>();
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");

        FindString(digits, map.get(digits.charAt(0)), "", map);

        return ans;
    }

    // digits = Given input, i.e, 23
    // digitvalue = value associated to digit, i.e, 2="abc", 3="def"
    // Combination = answer String (all possible combinations)
    // map = HashMap containing number + string pair

    static void FindString(String digits, String digitvalue, String Combination, HashMap<Character, String> map) {
        if (digits.length() == 0) {
            ans.add(Combination);
            return;
        }

        int n = digitvalue.length();
        for (int i = 0; i < n; i++) {
            if (digits.length() > 1) {
                FindString(digits.substring(1),
                           map.get(digits.charAt(1)),
                           Combination + digitvalue.charAt(i),
                           map);
            } else {
                FindString("", "", Combination + digitvalue.charAt(i), map);
            }
        }
    }

    // Main method to test your function
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String: ");
        String s=sc.nextLine();
        List<String> result =letterCombinations(s);

        System.out.println("Combinations for " +s+ " : ");
        for (String str : result) {
            System.out.println(str);
        }
    }
}
