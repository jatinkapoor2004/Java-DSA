package Dynamic_Programming;
public class zero_one_Knapsack_tail 
{
    public static void main(String[] args) {
        int wt[]={4,10,5};
        int val[]={70,50,80};
        int w=10;
        int n=wt.length;
        knapsack(w, wt, val, n,"");
    }
    static void knapsack(int w,int wt[],int val[],int n,String ans)
    {
        if(w==0 || n==0)
        {
            System.out.println(ans);
        }
        else
        {
            int index=n-1;
            
                if(w-wt[index]>=0)
                {
                    knapsack(w-wt[index], wt, val, n-1, ans+val[index]+" ");
                }
                knapsack(w, wt, val, n-1, ans);
            
        }
    }
}
