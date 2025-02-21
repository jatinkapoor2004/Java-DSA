package Dynamic_Programming;

import java.util.Arrays;

public class zero_one_knapsack_memoization_GFG 
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
        
        if(w==0)
        {
            return dp[0][n]=0;
        }
        else if(n==0)
        {
            //System.out.println(ans);
            return dp[w][0]=0;
        }
        else
        {
            if(dp[w][n]!=-1)
                return dp[w][n];
            else
            {
                int ans1=-1,ans2=-1,index=n-1;
                // include 
                if(w-wt[index]>=0)
                ans1=val[index]+knapSack(w-wt[index], wt, val, n-1);
            
                //Don't Include
                ans2=knapSack(w, wt, val, n-1);
                return dp[w][n]=Math.max(ans1, ans2);
            }
        }
    }
}
