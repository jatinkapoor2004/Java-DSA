package Dynamic_Programming;

import java.util.Arrays;

public class zero_one_knapsack_tabulation 
{
    static int dp[][];
    public static void main(String[] args) {
        int wt[]={3,1,2,5,4};
        int val[]={10,90,30,70,40};
        int w=1000;
        int n=wt.length;
        dp=new int[w+1][n+1];
        for(int i=0;i<dp.length;i++)
        {
            Arrays.fill(dp[i],-1);
        }
        System.out.println(knapSack(w, wt, val, n));
    }
    static int knapSack(int w, int wt[], int val[], int n) 
    { 
        //base case if w=0 and n can be anything
        for(int j=0;j<=n;j++)//run this loop with equal sign also
        {
            dp[0][j]=0;
        }
        //base case if n=0 and w can be anything
        for(int i=0;i<=w;i++)
        {
            dp[i][0]=0;
        }
        for(int i=1;i<=w;i++)//loops will i<=w equals sign is important
        {
            for(int j=1;j<=n;j++)
            {
                int ans1=-1,ans2=-1,index=j-1;
                // include 
                if(i-wt[index]>=0)
                ans1=val[index]+dp[i-wt[index]][j-1];
            
                //Don't Include
                ans2=dp[i][j-1];
                dp[i][j]=Math.max(ans1, ans2);//change w-->i and n-->j here also 
            }
        }
        return dp[w][n];
    }
}
