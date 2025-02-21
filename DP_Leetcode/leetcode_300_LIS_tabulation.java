package DP_Leetcode;

import java.util.Arrays;

public class leetcode_300_LIS_tabulation 
{
    static int dp[][];
    public static void main(String[] args) {
        int nums[]={10,9,2,5,3,7,101,18};
        System.out.println(lengthOfLIS(nums));
    }
    public static int lengthOfLIS(int[] nums)
    {
        int n=nums.length;
        //n and previous index 
        dp=new int[n+1][n+1];
        for(int i=0;i<dp.length;i++)
        {
            Arrays.fill(dp[i],-1);
        }
        return mine(nums, n,n);
    }
    static int mine(int a[],int n,int prev_index)
    {
        for(int i=0;i<=n;i++)
        {
            dp[0][i]=0;
        }
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=prev_index;j++)
            {
                int index=i-1;
                int ans1=0,ans2=0;
                if(j==a.length || a[index]<a[j])
                {
                    ans1=1+ dp[i-1][index];
                }
                ans2=dp[i-1][j];
            
                dp[i][j]=Math.max(ans1, ans2);
            }
        }
        return dp[n][prev_index];
            
            
        
    }
}
