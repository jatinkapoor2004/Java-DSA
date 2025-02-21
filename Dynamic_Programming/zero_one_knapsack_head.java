package Dynamic_Programming;
public class zero_one_knapsack_head
{
    public static void main(String[] args) {
        int wt[]={3,1,2,5,4};
        int val[]={10,90,30,70,40};
        int w=10;
        int n=wt.length;
        System.out.println(knapsack(w, wt, val, n,""));
    }
    static int knapsack(int w,int wt[],int val[],int n,String ans)
    {
        if(w==0 || n==0)
        {
            System.out.println(ans);
            return 0;
        }
        else
        {
            int index=n-1;
            int ans1=-1,ans2=-1;
                if(w-wt[index]>=0)
                {
                    ans1=val[index]+knapsack(w-wt[index], wt, val, n-1, ans+val[index]+" ");
                }
                ans2= knapsack(w, wt, val, n-1, ans);
            return Math.max(ans1, ans2);
        }
    }
}
