package DP_Leetcode;

import java.util.Arrays;

public class subset_sum_exists_or_not_GFG_memoization 
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
        if(target==0)
        {
            return dp[n][0]=true;
        }
        if (n==0)
        {
            return dp[0][target]=false;
        }
        else
        {
            if(dp[n][target]!=null)
            {
                return dp[n][target];
            }
            else
            {
                boolean ans1=false,ans2;
                int index=n-1;
                //include case
                if(target-a[index]>=0)
                {
                    ans1=isSubsetSum(n-1, a, target-a[index]);
                }
                //don't include
                ans2=isSubsetSum(n-1, a, target);
            
                return dp[n][target]=ans1 || ans2;
            }
            
        }
    }
}
