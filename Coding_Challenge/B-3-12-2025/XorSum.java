// LeetCode:-1863
// Question 2. Sum of All Subset XOR Totals
// The XOR total of an array is defined as the bitwise XOR of all its elements, or 0 if the array is empty.

// For example, the XOR total of the array [2,5,6] is 2 XOR 5 XOR 6 = 1.
// Given an array nums, return the sum of all XOR totals for every subset of nums. 

// Note: Subsets with the same elements should be counted multiple times.

// An array a is a subset of an array b if a can be obtained from b by deleting some (possibly zero) elements of b.

 

// Example 1:

// Input: nums = [1,3]
// Output: 6
// Explanation: The 4 subsets of [1,3] are:
// - The empty subset has an XOR total of 0.
// - [1] has an XOR total of 1.
// - [3] has an XOR total of 3.
// - [1,3] has an XOR total of 1 XOR 3 = 2.
// 0 + 1 + 3 + 2 = 6

import java.util.Scanner;

public class XorSum {

    public static int subsetXORSum(int[] nums) {
        return findSum(0, nums, 0);
    }

    private static int findSum(int xor, int[] nums, int i) {
        if (i == nums.length) {
            return xor;
        }
        return findSum(xor ^ nums[i], nums, i + 1)
             + findSum(xor, nums, i + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int result = subsetXORSum(nums);

        System.out.println("Subset XOR Sum = " + result);

    }
}
