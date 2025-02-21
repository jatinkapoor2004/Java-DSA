package DP_Leetcode;

import java.util.Arrays;

public class leetcode_518_coin_change_2_memoization 
{
    static int dp[][];
    public static void main(String[] args) {
        int coins[]={3,5,7,8,9,10,11};
        int amount=500;
        System.out.println(change(amount, coins));
    }
    public static int change(int amount, int[] coins) 
    {
        int n=coins.length;
        dp=new int[amount+1][n+1];
        for(int i=0;i<dp.length;i++)
        {
            Arrays.fill(dp[i],-1);
        }
        return mine(coins, amount, n);
    }
    static int mine(int a[],int target,int n)
    {
        if(target==0)
        {
            return dp[0][n]=1;
        }
        else if(n==0)
        {
            return dp[target][0]=0;
        }
        else
        {
            if(dp[target][n]!=-1)
                return dp[target][n];
            else
            {
                int ans1=0,ans2,index=n-1;
                if(target-a[index]>=0)
                ans1=mine(a, target-a[index], n);
                ans2=mine(a, target, n-1);
                return dp[target][n]=ans1+ans2;
            }
            
        }
    }
}
