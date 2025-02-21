package DP_Leetcode;

import java.util.Arrays;

public class leetcode_416_partition_equal_subset_memoization 
{   
    static Boolean dp[][];
    public static void main(String[] args) {
        int a[]={100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,99,97};
        System.out.println(canPartition(a));
    }
    public static boolean canPartition(int[] nums)
    {
        int total=Arrays.stream(nums).sum();
        int target=total/2,n=nums.length;
        if(total%2!=0)
            return false;
        dp=new Boolean[target+1][n+1];
        for(int i=0;i<=target;i++)
        {
            Arrays.fill(dp[i], null);
        }
        return mine(nums,target,n);
    }
    static boolean mine(int a[],int target,int n)
    {
        if(target==0)
        {
            return dp[0][n]=true;
        }
        if(n==0)
        {
            return dp[target][0]=false;
        }
        else
        {
            if(dp[target][n]!=null)
            {
                return dp[target][n];
            }
            else
            {
                boolean ans1=false,ans2=false;
                int index=n-1;
                if(target-a[index]>=0)
                {
                    ans1=mine(a, target-a[index], n-1);
                }
                ans2=mine(a, target, n-1);
                return dp[target][n]= ans1 || ans2;
            }
            
        }
    }
}
