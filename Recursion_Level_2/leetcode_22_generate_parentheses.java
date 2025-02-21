package Recursion_Level_2;

import java.util.*;

public class leetcode_22_generate_parentheses 
{
    public static void main(String[] args) 
    {
        System.out.println(generateParenthesis(3));
    }
    public static List<String> generateParenthesis(int n)
    {
        List<String> al=new ArrayList<>();
        generate_mine( "(",al,n-1,n);
        return al;
    }
    static void generate_mine(String ans,List<String> al,int open,int close)
    {
        if(open==0 && close==0)
        {
            al.add(ans);
        }
        else
        {
            if(open>0)
            {
                generate_mine(ans+"(", al, open-1, close);
            }
            if(close>0 && close>open)
            {
                generate_mine(ans+")", al, open, close-1);
            }
        }
    }
    
}
