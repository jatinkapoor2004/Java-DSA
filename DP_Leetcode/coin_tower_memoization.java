package DP_Leetcode;

import java.util.Arrays;

public class coin_tower_memoization
{
    static int dp[];
    public static void main(String[] args) {
        dp=new int [100+1];
        Arrays.fill(dp,-1);
        System.out.println(steps(100, 3, 4));
    }
    public static int steps(int n, int x, int y)
    {
        if(n==0)
        {
            return dp[0]=0;
        }
        else if(n==x || n==y || n==1)
        {
            return dp[n]=1;
        }
        else
        {
            if(dp[n]!=-1)
                return dp[n];
            else
            {
                int ans1=10000,ans2=10000,ans3=10000;
                if(n-1>=0)
                    ans1=1+steps(n-1, x, y);
            
                if(n-x>=0)
                    ans2=1+steps(n-x, x, y);
            
                if(n-y>=0)
                    ans3=1+steps(n-y, x, y);
            
                return dp[n]=Math.min(ans1, Math.min(ans2, ans3));
            }
            
        }
    }
}
