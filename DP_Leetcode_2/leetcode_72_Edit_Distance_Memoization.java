package DP_Leetcode_2;

import java.util.Arrays;

public class leetcode_72_Edit_Distance_Memoization 
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
        if(m==0)
        {
            return dp[0][n]=n;
        }
        else if(n==0)
        {
            return dp[m][0]=m;
        }
        else
        {
            if(dp[m][n]!=-1)
                return dp[m][n];
            
            int index1=m-1,index2=n-1;
            if(s1.charAt(index1)==s2.charAt(index2))
            {
                return 0+mine(s1, s2, m-1, n-1);
            }
            else
            {
                int delete=1 + mine(s1, s2, m-1, n);
                int replace=1 + mine(s1, s2, m-1, n-1);
                int insert=1 + mine(s1, s2, m, n-1);
                return dp[m][n]=Math.min(delete, Math.min(replace,insert));
            }
        }
    }
}
