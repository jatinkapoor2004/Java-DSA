package DP_Leetcode;

import java.util.Arrays;

public class leetcode_64_minimum_path_sum_in_matrix_memoization
{
    static int dp[][];
    public static void main(String[] args)
    {
        int a[][]={{1,3,1},{1,5,1},{4,2,1}};
        System.out.println(minPathSum(a));
    }
    public static int minPathSum(int[][] grid)
    {
        int M=grid.length;
        int N=grid[0].length;
        dp=new int[M][N];
        for(int i=0;i<dp.length;i++)
        {
            Arrays.fill(dp[i],-1);
        }
        return mine(grid, M-1, N-1,M,N);
    }
    public static int mine(int a[][],int r,int c,int M,int N)
    {
        if(r==0 && c==0)
        {
            return dp[r][c]=a[r][c];
        }
        else
        {
            if(dp[r][c]!=-1)
                return dp[r][c];
            else
            {
                int ans1=100000,ans2=100000;
                if(r-1>=0)
                {
                    ans1=a[r][c]+mine(a, r-1, c,M,N);
                }
                if(c-1>=0)
                {
                    ans2=a[r][c]+mine(a, r, c-1,M,N);
                }
                return dp[r][c]=Math.min(ans1, ans2);
            }
            
        }
    }
}
