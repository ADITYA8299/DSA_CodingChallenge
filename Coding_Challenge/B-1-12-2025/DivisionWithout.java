// ARRAY QUESTION (Moderate)
// Problem:

// Given an array of integers, return a new array where each element at index i contains the product of all elements except arr[i].

// ⚠ Do not use division.

// Example:
// Input:  [1, 2, 3, 4]
// Output: [24, 12, 8, 6]

import java.util.*;
public class DivisionWithout {
    public static void main(String[] args) {
        int[] arr={1, 2, 3, 4};
        int n=arr.length;
        int[] ans=new int[n];
        int sum=1;
        for(int i=0;i<n;i++){
            sum=sum*arr[i];
        }
        for(int i=0;i<n;i++){
            int total=sum;
            int quotient=0;
            while(total>0){
                total=total-arr[i];
                ++quotient;
            }
            ans[i]=quotient;
        }
        for(int i=0;i<n;i++){
            System.out.println(ans[i]);
        }
    }
}