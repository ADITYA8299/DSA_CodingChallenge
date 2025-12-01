//Count the Number of Consecutive Sequences

// You are given an unsorted array of integers.
// Your task is to count how many consecutive sequences exist in the array.

// A consecutive sequence is a group of numbers that appear in increasing order with a difference of exactly 1 between adjacent values.


import java.util.*;
public class ConsecutiveSequences {
    public static void main(String[] args) {
        // Scanner sc=new Scanner(System.in);
        // int n;
        // System.out.println("Enter the size of the array: ");
        // n=sc.nextInt();
        int[] arr={10, 20, 30, 40};
        // System.out.println("Enter the elements in the array: ");
        // for(int i=0;i<n;i++){
        //     arr[i]=sc.nextInt();
        // }
        // Sorting the array
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        int count=0;
        int i=0;
        while(i<n){
            while(i<n){
                if(i<n-1 && (arr[i]+1!=arr[i+1]) ){
                    break;
                }
                ++i;
            }
            ++count;
            ++i;
        }
        System.out.println(count);
    }
}

// Second method

// int count = 1;
//         int j=0;
//         for(int i=1;i<arr.length;i++){
//             if(!(arr[i]-arr[j]==1)){
//                 count+=1;
//             }
//             j++;
//         }