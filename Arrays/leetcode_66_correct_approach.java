package Arrays;

import java.util.Arrays;

public class leetcode_66_correct_approach 
{    
    public static void main(String[] args) 
    {
        int a[]={9,8,7,6,5,4,3,2,1,0};
        System.out.println(Arrays.toString(plusOne(a)));
    }
    public static int[] plusOne(int[] a)
    {
        for(int i=a.length-1;i>=0;i--)
        {
            if(a[i]!=9)
            {
                a[i]++;
                return a;
            }
            else
            {
                a[i]=0;
            }
        }
        int b[]=new int[a.length+1];
        b[0]=1;
        return b;
    }
}


