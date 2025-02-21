package DP_Leetcode;

import java.util.Arrays;

public class leetcode_416_partition_equal_subset_sum 
{
    public static void main(String[] args) {
        int a[]={100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,99,97};
        System.out.println(canPartition(a));
    }
    public static boolean canPartition(int[] nums)
    {
        int total=Arrays.stream(nums).sum();
        int sum=total/2;
        if(total%2!=0)
            return false;
        return mine(nums,sum,nums.length);
    }
    static boolean mine(int a[],int target,int n)
    {
        if(target==0)
        {
            return true;
        }
        if(n==0)
        {
            return false;
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
            return ans1 || ans2;
        }
    }
}
