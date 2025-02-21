package DP_Leetcode;
public class leetcode_322_coin_change_1 
{
    public static void main(String[] args) {
        int coins[]={411,412,413,414,415,416,417,418,419,420,421,422};
        int amount=9864;
        System.out.println(coinChange(coins, amount));
    }
    public static int coinChange(int[] a, int target)
    {
        int n=a.length;
        int ans= mine(a, target, n);
        if(ans==Integer.MAX_VALUE-1)
            return -1;
        return ans;
    }
    public static int mine(int a[],int target,int n)
    {
        if(target==0)
        {
            return 0;
        }
        else if(n==0)
        {
            return Integer.MAX_VALUE-1;
        }
        else
        {
            int ans1=Integer.MAX_VALUE-1,ans2=Integer.MAX_VALUE-1,index=n-1;
            if(target-a[index]>=0)
            {
                ans1=1 + mine(a, target-a[index], n);
            }
            
            ans2=mine(a, target, n-1);
            return Math.min(ans1, ans2);
        }
    }
}
