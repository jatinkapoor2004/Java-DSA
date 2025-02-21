package DP_Leetcode_2;

import java.util.Arrays;

public class leetcode_72_Edit_Distance_Tabulation
{
    static int dp[][];
    public static void main(String[] args) 
    {
        System.out.println(minDistance("dinitrophenylhydrazine", "benzalphenylhydrazone"));
    }
    public static int minDistance(String word1, String word2) 
    {
        int m=word1.length();
        int n=word2.length();
        dp=new int [m+1][n+1];
        for(int i=0;i<dp.length;i++)
        {
            Arrays.fill(dp[i],-1);
        }
        return mine(word1, word2, m, n);
    }
    public static int mine(String s1,String s2,int m,int n)
    {
        for(int i=0;i<=m;i++)
        {
            dp[i][0]=i;
        }
        for(int j=0;j<=n;j++)
        {
            dp[0][j]=j;
        }
        dp[0][0]=0;
        
        for(int i=1;i<=m;i++)
        {
            for(int j=1;j<=n;j++)
            {
                int index1=i-1,index2=j-1;
                if(s1.charAt(index1)==s2.charAt(index2))
                {
                    dp[i][j]= 0+dp[i-1][j-1];
                }
                else
                {
                    int delete=1 + dp[i-1][j];
                    int replace=1 + dp[i-1][j-1];
                    int insert=1 + dp[i][j-1];
                    dp[i][j]=Math.min(delete, Math.min(replace,insert));
                }
            }
        }
           return dp[m][n];
            
            
        
    }
}
