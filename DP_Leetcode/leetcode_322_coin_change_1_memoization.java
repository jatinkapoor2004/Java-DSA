package DP_Leetcode;

import java.util.Arrays;

public class leetcode_322_coin_change_1_memoization 
{
    static int dp[][];
    public static void main(String[] args) {
        int coins[]={411,412,413,414,415,416,417,418,419,420,421,422};
        int amount=9864;
        System.out.println(coinChange(coins, amount));
    }
    public static int coinChange(int[] a, int target)
    {
        int n=a.length;
        dp=new int[target+1][n+1];
        for(int i=0;i<dp.length;i++)
        {
            Arrays.fill(dp[i],-1);
        }
        int ans= mine(a, target, n);
        if(ans==Integer.MAX_VALUE-1)
            return -1;
        return ans;
    }
    public static int mine(int a[],int target,int n)
    {
        if(target==0)
        {
            return dp[0][n]=0;
        }
        else if(n==0)
        {
            return dp[target][0]=Integer.MAX_VALUE-1;
        }
        else
        {
            if(dp[target][n]!=-1)
                return dp[target][n];
            else
            {
                int ans1=Integer.MAX_VALUE-1,ans2=Integer.MAX_VALUE-1,index=n-1;
                if(target-a[index]>=0)
                {
                    ans1=1 + mine(a, target-a[index], n);
                }
            
                ans2=mine(a, target, n-1);
                return dp[target][n]=Math.min(ans1, ans2);
            }
            
        }
    }
}
