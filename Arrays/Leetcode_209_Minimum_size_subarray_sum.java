package Arrays;

import java.util.Arrays;

public class Leetcode_209_Minimum_size_subarray_sum 
{
    public static void main(String[] args) 
    {
        int a[]={1,1,1,1,1,1,1,1};
        System.out.println(Arrays.toString(a));
        System.out.println(minSubArrayLen(11, a));
    }
    public static int minSubArrayLen(int target, int[] a)
    {
        int l=0,len=10000000;
        int sum=0;
        for(int i=0;i<a.length;i++)
        {
            sum=sum+a[i];
            while(sum>=target)
            {
               len=Math.min(len, i-l+1);
               sum=sum-a[l];
               l++;
            }
            
        }
       
        if(len==10000000)
            return 0;
        else
            return len;
    }
}
