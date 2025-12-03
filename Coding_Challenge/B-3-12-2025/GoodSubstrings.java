import java.util.*;

public class GoodSubstrings {

    public static int countGoodSubstrings(String s) {
        int n = s.length();
        if (n < 3)
            return 0;
        int ans = 0;
        int start = 0, end = 3;
        while (end <= n) {
            String sub = s.substring(start, end);
            if (checkString(sub)) {
                ++ans;
            }
            ++start;
            ++end;
        }
        return ans;
    }

    static Boolean checkString(String sub) {
        HashSet<Character> set = new HashSet<>();
        for (char c : sub.toCharArray()) {
            set.add(c);
        }
        return set.size() == 3;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String s = sc.nextLine();
        System.out.println(countGoodSubstrings(s)); 
    }
}
