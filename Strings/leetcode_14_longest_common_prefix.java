package Strings;

import java.util.Arrays;

public class leetcode_14_longest_common_prefix 
{
    public static void main(String[] args)
    {
        String[]strs ={"flower","flow","flight",};
        Arrays.sort(strs);
        System.out.println(Arrays.toString(strs));
        System.out.println(longestCommonPrefix(strs));
    }
    public static String longestCommonPrefix(String[] str) 
    {
        String s="";
        int minlength=200;
        for(int i=0;i<str.length;i++)
        {
            if(str[i].length()<minlength)
            {
                minlength=str[i].length();
            }
        }
        System.out.println(minlength);
        for(int i=0;i<minlength;i++)
        {
            for(int j=0;j<str.length;j++)
            {
                if(str[j].charAt(i)==str[0].charAt(i))
                {
                    continue;
                }
                else
                    return s;
            }
            s=s+str[0].charAt(i);
        }
        return s;
    }
}
