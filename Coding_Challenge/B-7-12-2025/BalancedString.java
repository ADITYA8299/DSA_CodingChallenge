public class BalancedString {

    public static boolean isBalanced(String num) {
        int totalSum = 0;

        for (int i = 0; i < num.length(); i++) {
            char ch = num.charAt(i);
            if (i % 2 == 0) {
                totalSum += (ch - '0');
            } else {
                totalSum -= (ch - '0');
            }
        }
        return totalSum == 0;
    }

    public static void main(String[] args) {
        // Test cases
        String num1 = "121";
        String num2 = "1230";

        System.out.println("Is " + num1 + " balanced? " + isBalanced(num1));
        System.out.println("Is " + num2 + " balanced? " + isBalanced(num2));
    }
}
