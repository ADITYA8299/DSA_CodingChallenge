// You are given an integer array nums and an integer k.
// Return the length of the longest subarray whose sum is less than or equal to k.

import java.util.*;
public class LongestSubArray {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr={7, 1, 2, 3};
        System.out.println("Enter the value of k: ");
        int k=sc.nextInt();
        int sum=0;
        int j=0,i=0;
        int n=arr.length;
        int max=0;
        while(j<n){
            while(j<n && sum+arr[j]<=k){
                sum=sum+arr[j];
                ++j;
            }
            max=Math.max(max,j-i);
            sum=sum-arr[i];
            ++i;
        }
        System.out.println(max);
    }
}