package DP_Leetcode;
public class leetcode_1143_LCS 
{
    public static void main(String[] args)
    {
        System.out.println(longestCommonSubsequence("abcde", "ace"));
    }
    public static int longestCommonSubsequence(String text1, String text2) 
    {
        int m=text1.length();
        int n=text2.length();
        return mine(text1,text2,m,n);
    }
    static int mine(String s1,String s2,int m,int n)
    {
        if(m==0 || n==0)
        {
            return 0;
        }
        else
        {
            int i=m-1,j=n-1;
            if(s1.charAt(i)==(s2.charAt(j)))
            {
                return 1+mine(s1,s2,m-1,n-1);
            }
            else
            {
                int ans1=mine(s1,s2,m-1,n);
                int ans2=mine(s1,s2,m,n-1);
                return Math.max(ans1,ans2);
            }
        }
    }
}
