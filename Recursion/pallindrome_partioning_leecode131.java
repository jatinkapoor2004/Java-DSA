package Recursion;

import java.util.*;

public class pallindrome_partioning_leecode131 
{
    public static void main(String[] args) {
        String s="aab";
        System.out.println(partition(s));
    }
    public static List<List<String>> partition(String s)
    {
       List<List<String>> mainlist=new ArrayList<>();
        mine(s, 0, "",mainlist);
        return mainlist;
    }
    static void mine(String s,int i,String ans,List<List<String>> mainlist)
    {
        if(i==s.length())
        {
            boolean flag=true;
            ArrayList<String> al=new ArrayList<>();
            StringTokenizer st=new StringTokenizer(ans);
            int n =st.countTokens();
            for(int j=0;j<n;j++)
            {
                String p=st.nextToken();
                if(pallindrome(p))
                {
                    flag=true;
                    al.add(p);
                }
                else 
                {
                    flag=false;
                    break;
                }
            }
            if(flag==true)
            {
                mainlist.add(al);
            }
            
        }
        else if (i==s.length()-1)
        {
            char ch=s.charAt(i);
            mine(s, i+1, ans+ch, mainlist);
        }
        else
        {
            char ch=s.charAt(i);
            mine(s, i+1, ans+ch, mainlist);
            mine(s, i+1, ans+ch+" ", mainlist);
        }
    }
    static boolean pallindrome(String s)
    {
        return new StringBuffer(s).reverse().toString().equals(s);
    }
}
