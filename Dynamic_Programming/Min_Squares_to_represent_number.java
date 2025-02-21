package Dynamic_Programming;

import java.util.Arrays;

public class Min_Squares_to_represent_number 
{
    static int dp[];
    public static void main(String[] args) {
        dp=new int[5156+1];
        Arrays.fill(dp,-1);
        System.out.println(minsquares(5156,""));
    }
    static int minsquares(int n,String ans)
    {
        if(n==0)
        {
            return dp[0]=0;
        }
        else
        {
            if(dp[n]!=-1)
            {
                return dp[n];
            }
            else
            {
                int overallmin=10000;
                for(int i=1;i<=(int)Math.sqrt(n);i++)
                {
                    int ans1=1+minsquares(n-(i*i), ans+"("+i+"*"+i+")"+" ");
                    overallmin=Math.min(overallmin, ans1);
                }
                return dp[n]=overallmin;
            }    
        }
    }
    // normal printing 
//    static void minsquares(int n,String ans)
//    {
//        if(n==0)
//        {
//            System.out.println(ans);
//        }
//        else
//        {
//            
//            for(int i=1;i<=( int)Math.sqrt(n);i++)
//            {
//                minsquares(n-(i*i), ans+"("+i+"*"+i+")"+" ");
//            }
//        }
//    }
}
