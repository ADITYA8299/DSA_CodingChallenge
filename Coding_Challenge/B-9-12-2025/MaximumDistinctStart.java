import java.util.HashSet;
import java.util.Scanner;

public class MaximumDistinctStart {

    public int maxDistinct(String s) {
        HashSet<Character> set = new HashSet<>();

        for (char ch : s.toCharArray()) {
            set.add(ch);
        }
        return set.size();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        MaximumDistinctStart mds = new MaximumDistinctStart();
        int result = mds.maxDistinct(input);

        System.out.println("Maximum number of distinct characters: " + result);

        sc.close();
    }
}
