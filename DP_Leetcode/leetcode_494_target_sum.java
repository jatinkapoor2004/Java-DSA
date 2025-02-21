package DP_Leetcode;
public class leetcode_494_target_sum 
{
    public static void main(String[] args)
    {
        int nums[] = {1,1,1,1,1};
        int target=3;
        System.out.println(findTargetSumWays(nums, target));
    }
    public static int findTargetSumWays(int[] nums, int target)
    {
        int n=nums.length;
        return mine(nums,target,n);
    }
    public static int mine(int a[],int target,int n)
    {
        if(n==0)
        {
            if(target==0)
            {
                return 1;
            }
            else
            {
                return 0;
            }
        }
        else
        {
            int index=n-1;
            int ans1=mine(a,target-a[index],n-1);
            int ans2=mine(a,target+a[index],n-1);
            return ans1+ans2;
        }
    }
}
