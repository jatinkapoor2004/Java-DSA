package DP_Leetcode;
public class leetcode_300_longest_increasing_subsequence 
{
    public static void main(String[] args) {
        int nums[]={10,9,2,5,3,7,101,18};
        System.out.println(lengthOfLIS(nums));
    }
    public static int lengthOfLIS(int[] nums)
    {
        int n=nums.length;
        return mine(nums, n,n);
    }
    static int mine(int a[],int n,int prev_index)
    {
        if(n==0 )
        {
            return 0;
        }
        else
        {
            int index=n-1;
            int ans1=0,ans2=0;
            if(prev_index==a.length || a[index]<a[prev_index])
            {
                
                ans1=1+mine(a, n-1, index);
            }
            ans2=mine(a, n-1, prev_index);
            
            return Math.max(ans1, ans2);
        }
    }
}
