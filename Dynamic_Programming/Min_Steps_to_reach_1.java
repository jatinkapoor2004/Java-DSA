package Dynamic_Programming;

import java.util.Arrays;

public class Min_Steps_to_reach_1 
{
    static int dp[];
    public static void main(String[] args)
    {   
        //min_steps(5, "");
        int n=1000;
        dp=new int[n+1];
        Arrays.fill(dp,-1);
        System.out.println(min_steps(n,""));
        //System.out.println(Arrays.toString(dp));
    }
    static int min_steps(int n,String ans)
    {
        if(n==1)
        {
            //System.out.println(ans);
            return dp[1]=0;
        }
        else
        {
            if(dp[n]!=-1)
            {
                return dp[n];
            }
            else
            {
                int ans1=10000,ans2=10000,ans3=10000;
                if(n-1>=1)
                    ans1=1+min_steps(n-1, ans+"1 ");
                if(n%2==0)
                    ans2=1+min_steps(n/2, ans+"/2 ");
                if(n%3==0)
                    ans3=1+min_steps(n/3, ans+"/3 ");
                return dp[n]=Math.min(ans1, Math.min(ans2, ans3));
        
            }
        }
    }
}
