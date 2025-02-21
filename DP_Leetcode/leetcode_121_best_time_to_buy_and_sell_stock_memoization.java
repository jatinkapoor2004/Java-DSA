package DP_Leetcode;

import java.util.Arrays;

public class leetcode_121_best_time_to_buy_and_sell_stock_memoization
{
    static int dp[][];
    public static void main(String[] args) {
        int a[]={7,1,5,3,6,4};
        System.out.println(maxProfit(a));
    }
    public static int maxProfit(int[] a) 
    {
        //number of element ,profit
        dp=new int[a.length][a.length];
        for(int i=0;i<dp.length;i++)
        Arrays.fill(dp[i],-1);
        return mine(a, 0,0);
    }
    public static int mine(int a[],int n,int profit)
    {
        if(n>=a.length)
            return dp[0][0]=0;
        
        else
        {
            if(dp[n][profit]!=-1)
                return dp[n][profit];
            else
            {
                int max=0, inmax=0;
                for(int i=n+1;i<a.length;i++)
                {
                    inmax=0;
                    if(a[i]-a[n]>=0)
                    {
                        inmax=Math.max(inmax,a[i]-a[n]);
                        if(inmax>max)
                        {
                            max=inmax;
                        }
                    }
                }
                return dp[n][profit]=Math.max(max, mine(a, n+1,inmax));
            }
            
        }
    }
}
