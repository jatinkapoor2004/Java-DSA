package DP_Leetcode;

import java.util.Arrays;

public class leetcode_516_Longest_Palindromic_Subsequence 
{
    static int dp[][];
    public static void main(String[] args) 
    {
        System.out.println(longestPalindromeSubseq("cbbd"));
    }
    public static int longestPalindromeSubseq(String s) 
    {
        int m=s.length();
        String s2=new StringBuffer(s).reverse().toString();
        int n=s2.length();
        dp=new int[m+1][n+1];
        for(int i=0;i<dp.length;i++)
        {
            Arrays.fill(dp[i],-1);
        }
        return mine(s,s2,m,n);
    }
    static int mine(String s1,String s2,int m,int n)
    {
        if(m==0 || n==0)
        {
            if(m==0)
            {
                return dp[0][n]=0;
            }
            else
            {
                return dp[m][0]=0;
            }
        }
        else
        {
            if(dp[m][n]!=-1)
            {
                return dp[m][n];
            }
            else
            {
                int i=m-1,j=n-1;
                if(s1.charAt(i)==(s2.charAt(j)))
                {
                    return dp[m][n]=1+mine(s1,s2,m-1,n-1);
                }
                else
                {
                    int ans1=mine(s1,s2,m-1,n);
                    int ans2=mine(s1,s2,m,n-1);
                    return dp[m][n]=Math.max(ans1,ans2);
                }
            }
            
        }
    }
}
