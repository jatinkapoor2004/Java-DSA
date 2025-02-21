package Strings;
import java.util.*;
public class leetcode_1832_given_sentence_is_pangram 
{
    public static void main(String[] args) 
    {
        String s="onrcsnlxckptsxffbyswujpamfltvmdoxovggepknmtacrjkkorjgvgtgaiaudspnpxkwikevmjeephhiyvnoymjwjfopovscbefecnoytjxfwasabwohqujwowmakpyuuqvgfab";
        System.out.println(checkIfPangram(s));
    }
    public static boolean checkIfPangram(String s) 
    {
        
        HashSet<Character> hs=new HashSet<>();
        for(int i=0;i<s.length();i++)
        {
            hs.add(s.charAt(i));
        }
        return hs.size()==26;
    }
}
