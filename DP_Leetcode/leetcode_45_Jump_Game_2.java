package DP_Leetcode;

import java.util.Arrays;

public class leetcode_45_Jump_Game_2 
{
    static int dp[];
    public static void main(String[] args) 
    {
        //int a[]={2,3,1,1,4};
        int a[]={5,6,4,4,6,9,4,4,7,4,4,8,2,6,8,1,5,9,6,5,2,7,9,7,9,6,9,4,1,6,8,8,4,4,2,0,3,8,5};
        System.out.println(jump(a));
    }
    public static int jump(int[] nums) 
    {
        dp=new int[nums.length];
        Arrays.fill(dp,-1);
        return mine(nums,0);
    }
    public static int mine(int a[],int i)
    {
        if(a.length-1==i)
        {
            return dp[i]=0;
        }
        else
        {
            if(dp[i]!=-1)
            {
                return dp[i];
            }
            else
            {
                int overall_min=10000;
                for(int j=1;j<=a[i];j++)
                {
                    if(i+j<=a.length-1)
                    {
                        int ans1=1+mine(a, i+j);
                        if(ans1<overall_min)
                        {
                            overall_min=ans1;
                        }
                    }
                }
                return dp[i]=overall_min;
            }
        }
    }
}
