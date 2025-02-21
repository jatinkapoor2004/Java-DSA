package DP_Leetcode_2;

import java.util.Arrays;

public class leetcode_63_Unique_Paths_2_Memoization
{
    static int dp[][];
    public static void main(String[] args) {
        int a[][]={{0,0,0},{0,1,0},{0,0,0}};
        System.out.println(uniquePathsWithObstacles(a));
    }
    public static int uniquePathsWithObstacles(int[][] a) 
    {
        int m=a.length;
        int n=a[0].length;
        
        if(a[m-1][n-1]==1)
        return 0;
        dp=new int[m][n];
        for(int i=0;i<dp.length;i++)
        {
            Arrays.fill(dp[i],-1);
        }
        return mine(a, m-1, n-1);
    }
    static int mine(int a[][],int m,int n)
    {
        if(m==0 && n==0)
        {
            return dp[0][0]=1;
        }
        else
        {
            if(dp[m][n]!=-1)
                return dp[m][n];
            
            int ans1=0,ans2=0;
            if(m-1>=0 && a[m-1][n]==0)
            {
                ans1=mine(a, m-1, n);
            }
            if(n-1>=0 && a[m][n-1]==0)
            {
                ans2=mine(a, m, n-1);
            }
            return dp[m][n]=ans1+ans2;
        }
    }
}
