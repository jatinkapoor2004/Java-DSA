package Arrays;

import java.util.Arrays;

public class Leetcode_283_Move_Zeroes 
{
    public static void main(String[] args) {
        int a[]={0,1,0,3,12};
        System.out.println(Arrays.toString(a));
        moveZeroes(a);
        System.out.println(Arrays.toString(a));
    }
    public static void moveZeroes(int[] a)
    {
        int k=0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]!=0)
            {
                a[k]=a[i];
                k++;
            }
        }
        for(int i=k;i<a.length;i++)
        {
            a[i]=0;
        }
    }
}
