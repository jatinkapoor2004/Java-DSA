package DP_Leetcode;
public class leetcode_64_minimum_path_sum_in_matrix 
{
    public static void main(String[] args)
    {
        int a[][]={{1,3,1},{1,5,1},{4,2,1}};
        System.out.println(minPathSum(a));
    }
    public static int minPathSum(int[][] grid)
    {
        int r=grid.length-1;
        int c=grid[0].length-1;
        return mine(grid, r, c);
    }
    public static int mine(int a[][],int r,int c)
    {
        if(r==0 && c==0)
        {
            return a[r][c];
        }
        else
        {
            int ans1=100000,ans2=100000;
            if(r-1>=0)
            {
                ans1=a[r][c]+mine(a, r-1, c);
            }
            if(c-1>=0)
            {
                ans2=a[r][c]+mine(a, r, c-1);
            }
            return Math.min(ans1, ans2);
        }
    }
}
