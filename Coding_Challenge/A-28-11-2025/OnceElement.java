// Given an array of integers where every element appears exactly twice except for one element, which appears only once, find and return the element that appears only one time.

//Test Cases:

// 1. Input: [2, 3, 2, 4, 4]
// Output: 3
import java.util.*;
public class OnceElement {
    public static void main(String[] args) {
        int[] arr={2,2,2,4,3, 3, 2, 4, 4};
        int ans=0;
        for(int i:arr){
            ans=ans^i;
        }
        System.out.println(ans);
    }
}