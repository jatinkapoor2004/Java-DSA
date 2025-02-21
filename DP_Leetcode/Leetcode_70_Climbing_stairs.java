package DP_Leetcode;

import java.util.Arrays;

public class Leetcode_70_Climbing_stairs 
{
    public static void main(String[] args)
    {
        System.out.println(climbStairs(3));
    }
     public static int climbStairs(int n)
    {
        int dp[]=new int[n+1];
        Arrays.fill(dp,-1);
        return mine(n, dp);
    }
     static int mine(int n,int dp[])
     {
         if(n==0)
         {
             return dp[0]=1;
         }
         else
         {
             if(dp[n]!=-1)
             {
                 return dp[n];
             }
             else
             {
                 int ans1=mine(n-1, dp),ans2=0;
                 if(n-2>=0)
                 {
                      ans2=mine(n-2, dp);
                 }
                 return dp[n]=ans1+ans2;
             }
         }
     }
}
