package DP_Leetcode;

import java.util.Arrays;

public class subset_sum_exist_or_not_GFG_tabulation 
{
    static Boolean dp[][];
    public static void main(String[] args) {
        int a[]={1,2,7,8,10};
        int target=10;
        int n=a.length;
        dp=new Boolean[n+1][target+1];
        
        for(int i=0;i<=n;i++)
        Arrays.fill(dp[i],null);
        
        System.out.println(isSubsetSum(n, a, target));
    }
    static Boolean isSubsetSum(int n, int a[], int target)
    {
        //converting base cases to tabulation
        // if target is zero and n can be anything
        for(int i=0;i<=n;i++)
        {
            dp[i][0]=true;
        }
        // if n=0 and target can be anything
        for(int j=0;j<=target;j++)
        {
            dp[0][j]=false;
        }
        //if both are zero
        dp[0][0]=true;
        
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=target;j++)
            {
                boolean ans1=false,ans2;
                int index=i-1;
                //include case
                if(j-a[index]>=0)
                {
                    ans1=dp[i-1][j-a[index]];
                }
                //don't include
                ans2=dp[i-1][j];
            
                dp[i][j]=ans1 || ans2;
            }
        }
        return dp[n][target];
    }
    
}
