package DP_Leetcode;

import java.util.Arrays;

public class leetcode_1143_LCS_tabulation
{
    static int dp[][];
    public static void main(String[] args)
    {
        System.out.println(longestCommonSubsequence("abcde", "ace"));
    }
    public static int longestCommonSubsequence(String text1, String text2) 
    {
        int m=text1.length();
        int n=text2.length();
        dp=new int[m+1][n+1];
        for(int i=0;i<dp.length;i++)
        {
            Arrays.fill(dp[i],-1);
        }
        return mine(text1,text2,m,n);
    }
    static int mine(String s1,String s2,int m,int n)
    {
        for(int i=0;i<=m;i++)
        {
            dp[i][0]=0;
        }
        for(int j=0;j<=n;j++)
        {
            dp[0][j]=0;
        }
        
        for(int i=1;i<=m;i++)
        {
            for(int j=1;j<=n;j++)
            {
                int index1=i-1,index2=j-1;
                if(s1.charAt(index1)==(s2.charAt(index2)))
                {
                    dp[i][j] = 1+dp[i-1][j-1];
                }
                else
                {
                    int ans1=dp[i-1][j];
                    int ans2=dp[i][j-1];
                    dp[i][j]=Math.max(ans1,ans2);
                }
                
            }
        }
            return dp[m][n];
                
    }
}
