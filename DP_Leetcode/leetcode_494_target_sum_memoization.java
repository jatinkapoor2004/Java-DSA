package DP_Leetcode;

import java.util.Arrays;

public class leetcode_494_target_sum_memoization 
{
    static int dp[][];
    static int offset;
    public static void main(String[] args)
    {
        int nums[] = {1,1,1,1,1};
        int target=3;
        System.out.println(findTargetSumWays(nums, target));
    }
    public static int findTargetSumWays(int[] nums, int target)
    {
        int n=nums.length;
        int sum=Arrays.stream(nums).sum();
        //System.out.println("sum of array is "+sum);
        offset=sum-target;
        //System.out.println("offset is" +offset);
        dp=new int[n+1][ (sum*2) +1];
        for(int i=0;i<dp.length;i++)
        {
            Arrays.fill(dp[i], -1);
        }
        return mine(nums,target,n);
    }
    public static int mine(int a[],int target,int n)
    {
        if(n==0)
        {
            if(target==0)
            {
                return dp[0][0+offset]=1;
            }
            else
            {
                return dp[0][target+offset]=0;
            }
        }
        else
        {
            if(dp[n][target+offset]!=-1)
                return dp[n][target+offset];
            else
            {
                int index=n-1;
                int ans1=mine(a,target-a[index],n-1);
                int ans2=mine(a,target+a[index],n-1);
                return dp[n][target+offset]=ans1+ans2;
            }
            
        }
    }
}
