// 1. Easy → Moderate (Array Question)
// Problem: Count Elements Greater Than Their Previous
// You are given an array of integers.
// Your task is to count how many elements are strictly greater than the element immediately before them.
// Example
// Input:
// arr = [10, 5, 20, 20, 30, 15, 40]
// Output:
// 3


import java.util.*;
public class StrictlyGreater {
    public static void main(String[] args) {
        int[] arr={10, 5, 20, 20, 30, 15, 40};
        int count=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>arr[i-1])
                ++count;
        }
        System.out.println(count);
    }
}
