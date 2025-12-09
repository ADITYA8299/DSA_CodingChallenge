import java.util.Scanner;

public class ReverseVowels {

    public String reverseVowels(String s) {
        String vowels = "";
        String ans = "";

        // Collect vowels in reverse order
        for (char ch : s.toCharArray()) {
            if (isVowel(ch)) {
                vowels = ch + vowels;
            }
        }

        int i = 0;
        // Build final string
        for (char ch : s.toCharArray()) {
            if (isVowel(ch)) {
                ans = ans + vowels.charAt(i);
                i++;
            } else {
                ans = ans + ch;
            }
        }

        return ans;
    }

    // Helper method to check vowel
    private boolean isVowel(char ch) {
        return ch == 'a' || ch == 'A' ||
               ch == 'e' || ch == 'E' ||
               ch == 'i' || ch == 'I' ||
               ch == 'o' || ch == 'O' ||
               ch == 'u' || ch == 'U';
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        ReverseVowels rv = new ReverseVowels();
        String result = rv.reverseVowels(input);

        System.out.println("String after reversing vowels: " + result);

        sc.close();
    }
}
