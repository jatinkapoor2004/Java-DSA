package Recursion_Level_2;
import java.util.*;

public class leetcode_131_palindrome_partitioning 
{
    public static void main(String[] args) {
        System.out.println(partition("aab"));
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
            List<String> al=new ArrayList<>();
            StringTokenizer st=new StringTokenizer(ans);
            int n=st.countTokens();
            for(int j=0;j<n;j++)
            {
                String p=st.nextToken();
                if(check(p))
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
        else
        {
            if(i<s.length()-1)
            {
                mine(s, i+1, ans+s.charAt(i)+" ", mainlist);
            }
            mine(s, i+1, ans+s.charAt(i), mainlist);
        }
    }
    static boolean check(String s)
    {
        return new StringBuffer(s).reverse().toString().equals(s);
    }
            
}
