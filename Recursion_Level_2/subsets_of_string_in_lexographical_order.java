package Recursion_Level_2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

public class subsets_of_string_in_lexographical_order 
{
    public static void main(String[] args) {
        List<String> al=new ArrayList<>();
        lexographical_subsets("leetcode", 0, "", al);
        Collections.sort(al);
        System.out.println(al);
    }
    static void lexographical_subsets(String s,int i,String ans,List<String> al)
    {
        if(i==s.length())
        {
            al.add(ans);
        }
        else
        {
            lexographical_subsets(s, i+1, ans+s.charAt(i),al);
            lexographical_subsets(s, i+1, ans, al);
        }
    }
}
