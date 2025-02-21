package DP_Leetcode_2;

import java.util.Arrays;

public class leetcode_42_Trapping_Rain_Water 
{
    public static void main(String[] args) 
    {
        int a[]={4,2,0,3,2,5};
        System.out.println(trap(a));
    }
    public static int trap(int[] a) 
    {
        int left[]=new int[a.length],right[]=new int [a.length];
        int max=0;
        //left[0]=0;
        for(int i=0;i<a.length;i++)
        {
            left[i]=Math.max(max, a[i]);
            max=left[i];
        }
        //System.out.println(Arrays.toString(left));
        max=0;
        //right[a.length-1]=0;
        for(int i=a.length-1;i>=0;i--)
        {
            right[i]=Math.max(max, a[i]);
            max=right[i];
        }
        //System.out.println(Arrays.toString(right));        
        int sum=0;
        for(int i=0;i<a.length;i++)
        {
            sum = sum + Math.min(left[i], right[i]) - a[i];
            //System.out.println(i + "th iteration and sum is "+sum);
            
        }
        return sum;
    }
}
