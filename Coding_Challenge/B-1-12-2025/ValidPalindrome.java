// 2. 🔹 STRING QUESTION (Easy–Moderate)
// Problem:

// Given a string s, return True if it is a valid palindrome after removing all non-alphanumeric characters and ignoring cases.
// Otherwise return False.

// 🔍 Details:

// Ignore spaces, punctuation, symbols

// Compare characters in lowercase

// Empty string counts as palindrome

// Example 1:
// Input:  "A man, a plan, a canal: Panama"
// Output: True

// Example 2:
// Input:  "race a car"
// Output: False


import java.util.*;
public class ValidPalindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str=sc.nextLine();
        str=str.toLowerCase();
        int n=str.length();
        String check="";
        for(int i=0;i<n;i++){
            char ch=str.charAt(i);
            if((ch>='a' && ch<='z')||(ch>='0' && ch<='9'))
                check=check+ch;
        }
        n=check.length();
        Boolean checkPalin=true;
        for(int i=0;i<n/2;i++){
            if(check.charAt(i)!=check.charAt(n-i-1)){
                checkPalin=false;
                break;
            }
        }
        System.out.println(checkPalin);
    }
}
