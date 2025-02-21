package Dynamic_Programming;

import java.util.Arrays;

public class Fibonacci_Nth_Term 
{
    public static void main(String[] args) 
    {
        int n=60;
        long dp[]=new long[n+1];
        Arrays.fill(dp,-1);
        System.out.println(fibo(n,dp));
        
    }
    static long fibo(int n,long dp[])
    {
        if(n==1)
        {
            return dp[1]=0;
        }
        if(n==2)
        {
            return dp[2]=1;
        }
        else
        {
            if(dp[n]!=-1)
            {
                return dp[n];
            }
            else
            {
                return dp[n]=fibo(n-1, dp)+fibo(n-2, dp);
            }
        }
    }
}
