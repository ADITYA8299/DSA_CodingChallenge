// Given a string, return the length of the longest substring that contains no repeating characters.

// Test Cases:

// 1. Input: "pwwkew"
// Output: 3

import java.util.*;
public class LongestSubstring {

    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str;
        System.out.println("Enter the String : ");
        str=sc.nextLine();
        int max=0;
        String sub="";
        int j=0;
        int n=str.length();
        if(str.length()==1)
            System.out.println("1");
        while(j<n){
            sub=sub+str.charAt(j);
            for(int i=j+1;i<n;i++){
                char ch=str.charAt(i);
                if(sub.indexOf(ch)!=-1){
                    break;
                }
                else{
                    sub=sub+ch;
                }
            }
            ++j;
            if(sub.length()>max){
                max=sub.length();
            }
            sub="";
        }
        System.out.println(max);
    }
}
