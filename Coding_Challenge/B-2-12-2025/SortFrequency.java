// Question 2 : Sort Characters By Frequency

// Problem:
// Return the characters of a string sorted in decreasing order of frequency.

// Example:


// Input: s = "cccaaa"
// Output: "aaaccc" or "cccaaa"

// Example

// Input: s = "bbbaaaac"
// Output: "aaaa bbb c" → "aaaabbbc" or "bbb aaa a c"




import java.util.*;

public class SortFrequency {

    public static String frequencySort(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int i, n;
        char ch;
        n = s.length();

        for (i = 0; i < n; i++) {
            ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        int max = 0;
        ch = ' ';
        String ans = "";
        Set<Character> keys = map.keySet();
        n = keys.size();

        for (i = 0; i < n; i++) {
            for (char j : keys) {
                if (map.get(j) > max) {
                    max = map.get(j);
                    ch = j;
                }
            }
            for (int j = 0; j < max; j++) {
                ans = ans + ch;
            }
            map.put(ch, 0);
            max = 0;
            ch = ' ';
        }
        return ans;
    }

    public static void main(String[] args) {
        String input;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String: ");
        input=sc.nextLine();
        String output = frequencySort(input);
        System.out.println("Sorted by frequency: " + output);
    }
}
