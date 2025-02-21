package Dynamic_Programming;

import java.util.Arrays;

public class ways_to_reach_target_memoization 
{
    static int dp[][];
    public static void main(String[] args) {
        int a[]={1,2,7,8,10, 11,12,17,18,20, 21,22,27,28,30, 31,32,37,38,40, 111,112,117,118,1110, 1111,122,127,128,220, 213,232,237,283,330, 431,342,437,438,440 };
        int n=a.length;
        dp=new int[1001][n+1];
        for(int i=0;i<dp.length;i++)
        {
            Arrays.fill(dp[i],-1);
        }
        System.out.println(ways(a, 1000, n));
    }
    static int ways( int a[],int target,int n) 
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
            {
                return dp[target][n];
            }
            else
            {
                int ans1=0,ans2=0,index=n-1;
                if(target-a[index]>=0)
                {
                    ans1=ways(a, target-a[index], n-1);
                }
                ans2=ways(a, target, n-1);
                return dp[target][n]=ans1+ans2;
            }
        }
    }
}
