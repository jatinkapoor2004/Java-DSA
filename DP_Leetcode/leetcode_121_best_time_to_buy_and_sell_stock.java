// it is giving TLE bcoz of O(n2) complexity
package DP_Leetcode;
public class leetcode_121_best_time_to_buy_and_sell_stock 
{
    public static void main(String[] args) {
        int a[]={7,1,5,3,6,4};
        System.out.println(maxProfit(a));
    }
    public static int maxProfit(int[] a) 
    {
        int max_profit=0;
        int current_profit=0;
        int buy_price=a[0];
        for(int i=1;i<a.length;i++)
        {
            if(a[i]<buy_price)
            {
                buy_price=a[i];
            }
            current_profit=a[i]-buy_price;
            max_profit=Math.max(max_profit, current_profit);
        }
      return max_profit;  
    }
//    public static int maxProfit(int[] a) 
//    {
//        
//        return mine(a, 0);
//    }
//    public static int mine(int a[],int n)
//    {
//        if(n==a.length)
//            return 0;
//        else
//        {
//            int max=0;
//            for(int i=n+1;i<a.length;i++)
//            {
//                int inmax=0;
//                if(a[i]-a[n]>=0)
//                {
//                    inmax=Math.max(inmax,a[i]-a[n]);
//                    if(inmax>max)
//                    {
//                        max=inmax;
//                    }
//                }
//            }
//            return Math.max(max, mine(a, n+1));
//        }
//    }
}
