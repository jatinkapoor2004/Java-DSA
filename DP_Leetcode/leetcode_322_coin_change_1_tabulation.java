package DP_Leetcode;

import java.util.Arrays;

public class leetcode_322_coin_change_1_tabulation 
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
        for(int j=0;j<=n;j++)
        {
            dp[0][j]=0;
        }
        for(int i=0;i<=target;i++)
        {
            dp[i][0]=Integer.MAX_VALUE-1;
        }
        
        for(int i=1;i<=target;i++)
        {
            for(int j=1;j<=n;j++)
            {
                int ans1=Integer.MAX_VALUE-1,ans2=Integer.MAX_VALUE-1,index=j-1;
                if(i-a[index]>=0)
                {
                    ans1=1 + dp[i-a[index]][j];
                }
            
                ans2=dp[i][j-1];
                dp[i][j]=Math.min(ans1, ans2);
            }
        }
        return dp[target][n];
    }
}
