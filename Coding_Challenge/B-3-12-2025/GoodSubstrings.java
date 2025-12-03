// LeetCode:- 1876
// Question 1. Substrings of Size Three with Distinct Characters

// A string is good if there are no repeated characters.

// Given a string s​​​​​, return the number of good substrings of length three in s​​​​​​.

// Note that if there are multiple occurrences of the same substring, every occurrence should be counted.

// A substring is a contiguous sequence of characters in a string.

 

// Example 1:

// Input: s = "xyzzaz"
// Output: 1
// Explanation: There are 4 substrings of size 3: "xyz", "yzz", "zza", and "zaz". 
// The only good substring of length 3 is "xyz".


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
