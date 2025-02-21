package DP_Leetcode;

import java.util.Arrays;

public class Leetcode_198_House_Robber 
{
    static int []dp;
    public static void main(String[] args) 
    {
        int a[]={2,7,9,3,1};
        System.out.println(Arrays.toString(a));
        
        System.out.println(rob(a));
    }
    public static int rob(int[] nums) 
    {
        dp=new int[nums.length+1];
        Arrays.fill(dp, -1);
       return mine(nums, nums.length);
    }
    static int mine(int a[],int len)
    {
        if(len==0)return dp[0]=0;        
        if(len==1)return dp[1]=a[0];       
        //no need of this test case.
        //if(len==2)return Math.max(a[0], a[1]);       
        else
        {
            if(dp[len]!=-1)
            {
                return dp[len];
            }
            else
            {
                int i=len-1;
                int ans1=0,ans2=0;
                //Include ith house and try to jump to len-2,len-3...so on.
                ans1=a[i];
                int temp_max=-1;
                for(int j=2;j<=len;j++)
                {
                    int temp_ans1=mine(a, len-j);
                    if(temp_ans1>temp_max)
                    {
                        temp_max=temp_ans1;
                        //return overallmax;
                    }
                }
                ans1=ans1+temp_max;
                //Don't Include
                ans2= mine(a, len-1);
                return dp[len]=Math.max(ans1,ans2);
            }
        }
    }
}
