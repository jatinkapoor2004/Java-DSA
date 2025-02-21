package DP_Leetcode;

import java.util.Arrays;

public class leetcode_416_partition_equal_subset_sum_tabulation 
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
        for(int j=0;j<=n;j++)
        {
            dp[0][j]=true;
        }
        for(int i=0;i<=target;i++)
        {
            dp[i][0]=false;
        }
        dp[0][0]=true;
        for(int i=1;i<=target;i++)
        {
            for(int j=1;j<=n;j++)
            {
                boolean ans1=false,ans2=false;
                int index=j-1;
                if(i-a[index]>=0)
                {
                    ans1=dp[i-a[index]][j-1];
                }
                ans2=dp[i][j-1];
                dp[i][j]= ans1 || ans2;
            }
        }
        return dp[target][n];
    }
}
