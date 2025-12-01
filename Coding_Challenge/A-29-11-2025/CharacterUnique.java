// You are given a string s.
// Your task is to find the first character that appears only once in the string and return its index.

// If the character does not appear exactly once (i.e., it appears multiple times), ignore it.

// If no unique character exists, return -1.

import java.util.*;
public class CharacterUnique {

    static int firstUniqChar(String s) {
        HashMap< Character,Integer> map =new HashMap<>();
        int n=s.length();
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(int i=0;i<n;i++){
            char key=s.charAt(i);
            if(map.get(key)==1)
                return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String: ");
        String s=sc.nextLine();
        System.out.println("Answer : "+firstUniqChar(s));
    }   
}
