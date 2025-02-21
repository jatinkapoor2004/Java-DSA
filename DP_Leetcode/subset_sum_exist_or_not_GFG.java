package DP_Leetcode;
public class subset_sum_exist_or_not_GFG 
{
    public static void main(String[] args) {
        int a[]={1,2,7,8,10};
        int target=10;
        int n=a.length;
        System.out.println(isSubsetSum(n, a, target));
    }
    static Boolean isSubsetSum(int n, int a[], int target)
    {
        if(target==0)
        {
            return true;
        }
        if (n==0)
        {
            return false;
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
            
            return ans1 || ans2;
        }
    }
}
