package Strings;

import java.util.Arrays;

public class count_anagrams_of_W_in_string_S 
{
    public static void main(String[] args) 
    {
        System.out.println(W_in_S("abcdefbcabcacbaxyz", "abc"));
    }
    static int W_in_S(String s,String w)
    {
        char b[]=w.toCharArray();
        int count=0;
        for(int i=0;i<=s.length()-w.length();i++)
        {
            char a[]=s.substring(i,i+w.length()).toCharArray();
            Arrays.sort(a);
            if(Arrays.equals(a, b))
                count++;
        }
        return count;
    }
    
}
