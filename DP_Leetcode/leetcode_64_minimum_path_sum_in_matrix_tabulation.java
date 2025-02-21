package DP_Leetcode;

import java.util.Arrays;

public class leetcode_64_minimum_path_sum_in_matrix_tabulation
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
        //base case 
        dp[0][0]=a[0][0];
        
        for(int i=0;i<=r;i++)//changing range bcoz we need loop for 
                             // whole matrix except 0,0 we run loop
                             //for whole matrix and skip on 0,0 as we
                             // already covered it with base case 
        {
            for(int j=0;j<=c;j++)
                {
                    if(i==0 && j==0)
                        continue;
                int ans1=100000,ans2=100000;
                if(i-1>=0)
                {
                    ans1=a[i][j]+dp[i-1][j];
                }
                if(j-1>=0)
                {
                    ans2=a[i][j]+dp[i][j-1];
                }
                dp[i][j]=Math.min(ans1, ans2);
            }  
        }
        return dp[r][c];
    }
}
