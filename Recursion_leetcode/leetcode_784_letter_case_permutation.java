package Recursion_leetcode;

import java.util.*;

public class leetcode_784_letter_case_permutation 
{
    public static void main(String[] args) 
    {
        System.out.println(letterCasePermutation("a1b2"));
    }
    public static List<String> letterCasePermutation(String s)
    {
        List<String> al=new ArrayList<>();
        mine(s, "", al,0);
        return al;
    }
    static void mine(String s,String ans,List<String> al,int i)
    {
        if(i==s.length())
        {
            al.add(ans);
        }
        else
        {
            char ch=s.charAt(i);
            if(ch>='0'&& ch<='9')
            {
                mine(s, ans+ch, al, i+1);
            }
            else
            {
                mine(s, ans+Character.toUpperCase(ch), al, i+1);
                mine(s, ans+Character.toLowerCase(ch), al, i+1);
            }
            
//                char ch1=s.charAt(i);
//                if(ch1>='a' && ch1<='z')
//                {
//                    char ch2=Character.toUpperCase(ch1);
//                    mine(s, ans+ch1, al,i+1);
//                    mine(s, ans+ch2, al,i+1);
//                }
//                else if(ch1>='A' && ch1<='z')
//                {
//                    char ch2=Character.toLowerCase(ch1);
//                    mine(s, ans+ch1, al,i+1);
//                    mine(s, ans+ch2, al,i+1);
//                }
//                else
//                {
//                    mine(s, ans+ch1, al,i+1);
//                    //mine(rem, ans+ch2, al);
//                }
                
        }
    }
}
