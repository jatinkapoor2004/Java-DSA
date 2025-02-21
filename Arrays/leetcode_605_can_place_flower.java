package Arrays;

import java.util.Arrays;

public class leetcode_605_can_place_flower 
{
    public static void main(String[] args)
    {
        int a[]={1,0,1,0,0,1,0};
        System.out.println(canPlaceFlowers(a,1));
    }
    
    public static boolean canPlaceFlowers(int[] a, int n)
    {
        if(a.length==1)
        {
            if(n==1 && a[0]==1)
                return false;
            else
                return true;
        }
        if(a[0]==0 && a[1]==0)
        {
           n--;
           a[0]=1;
        }
         System.out.println(Arrays.toString(a));

        if(a[a.length-1]==0 && a[a.length-2]==0)
        {
            n--;
            a[a.length-1]=1;
        }
        System.out.println(Arrays.toString(a));
        System.out.println("outside loop "+ n);
        for(int i=0;i<a.length-2;i++)
        {
            if(a[i]==0 && a[i+1]==0 && a[i+2]==0)
            {
                a[i+1]=1;
                n--;
            }
            System.out.println(n);
        }
        System.out.println("After loop " +n);
        if(n<=0)
        {
            return true;
        }
        else 
            return false;
        
    }
   
}
