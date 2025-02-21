package Dynamic_Programming;

import java.util.Arrays;

public class ways_to_reach_target_tabulation 
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
        //base case if target=0 number of elements left anthing 
        for(int j=0;j<=n;j++)
        {
            dp[0][j]=1;
        }
        // base case if number of elements left=0 target is anything
        for(int i=0;i<=target;i++)
        {
            dp[i][0]=0;
        }
        // base 3 important both target and n is 0
        dp[0][0]=1;
        for(int i=1;i<=target;i++)
        {
            for(int j=1;j<=n;j++)
            {
                int ans1=0,ans2=0,index=j-1;
                if(i-a[index]>=0)
                {
                    ans1=dp[i-a[index]][j-1];
                }
                ans2=dp[i][j-1];
                dp[i][j]=ans1+ans2;
            }
        }
        return dp[target][n];
    }
}
