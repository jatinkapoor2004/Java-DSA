package DP_Leetcode;

import java.util.Arrays;

public class leetcode_300_LIS_memoization 
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
        if(n==0 )
        {
            return dp[0][prev_index]=0;
        }
        else
        {
            if(dp[n][prev_index]!=-1)
                return dp[n][prev_index];
            
            int index=n-1;
            int ans1=0,ans2=0;
            if(prev_index==a.length || a[index]<a[prev_index])
            {
                
                ans1=1+mine(a, n-1, index);
            }
            ans2=mine(a, n-1, prev_index);
            
            return dp[n][prev_index]=Math.max(ans1, ans2);
        }
    }
}
