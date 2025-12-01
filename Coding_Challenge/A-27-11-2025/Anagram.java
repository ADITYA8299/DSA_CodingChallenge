//You are given two strings.
//Your task is to determine whether the two strings are anagrams of each other.

import java.util.*;
public class Anagram {

    static Boolean IsAnagram(String a,String b){
        HashMap<Character,Integer> mapA = new HashMap<>();
        HashMap<Character,Integer> mapB = new HashMap<>();
        if(a.length()!= b.length()){
            return false;
        }
        for(int i=0;i<a.length();i++){
            char ch=a.charAt(i);
            mapA.put(ch, mapA.getOrDefault(ch,0)+1);
        }
        for(int i=0;i<b.length();i++){
            char ch=b.charAt(i);
            mapB.put(ch, mapB.getOrDefault(ch,0)+1);
        }
        for(int i=0;i<a.length();i++){
            char ch=a.charAt(i);
            if(mapA.get(ch)!=mapB.get(ch)){
                return false;
            }
        }
        return true;
    }
        public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a,b;
        System.err.println("Enter the First String: ");
        a=sc.nextLine();
        System.err.println("Enter the Second String: ");
        b=sc.nextLine();
        Boolean ans=IsAnagram(a,b);
        if(ans)
            System.out.println("String is anagram string");
        else
            System.out.println("String is not an anagram String");
    }
}

//Time Taken = 8:54 min