package Strings;

import java.util.HashSet;

public class leetcode_459_repeated_substring_pattern 
{
    public static void main(String[] args) {
        System.out.println(repeatedSubstringPattern("ababab"));
    }
    public static boolean repeatedSubstringPattern(String s) 
    {
        String p;
        HashSet<String> hs=new HashSet<>();
        for(int i=0;i<s.length();i++)
        {
            p=s.substring(0, i+1);
            if(hs.contains(p))
            {
                break;
            }
            else
            {
                hs.add(p);
            }
        }
        System.out.println(hs);
        return true;
    }
}
