package DP_Leetcode;

import java.util.Arrays;

public class leetcode_518_coin_change_2_tabulation 
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
        for(int i=0;i<=n;i++)
        {
            dp[0][i]=1;
        }
        for(int i=0;i<=target;i++)
        {
            dp[i][0]=0;
        }
        dp[0][0]=1;
        for(int i=1;i<=target;i++)
        {
            for(int j=1;j<=n;j++)
            {
                int ans1=0,ans2,index=j-1;
                if(i-a[index]>=0)
                ans1=dp[i-a[index]][j];
                ans2=dp[i][j-1];
                dp[i][j]=ans1+ans2;
            }
        }
        return dp[target][n];
    }
}
