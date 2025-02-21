package DP_Leetcode_2;
public class leetcode_63_Unique_Paths_2 
{
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
        
        return mine(a, m-1, n-1);
    }
    static int mine(int a[][],int m,int n)
    {
        if(m==0 && n==0)
        {
            return 1;
        }
        else
        {
            int ans1=0,ans2=0;
            if(m-1>=0 && a[m-1][n]==0)
            {
                ans1=mine(a, m-1, n);
            }
            if(n-1>=0 && a[m][n-1]==0)
            {
                ans2=mine(a, m, n-1);
            }
            return ans1+ans2;
        }
    }
}
