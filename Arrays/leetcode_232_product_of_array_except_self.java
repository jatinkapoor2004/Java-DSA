package Arrays;

import java.util.Arrays;

public class leetcode_232_product_of_array_except_self 
{
    public static void main(String[] args) {
        int a[]={0,0};
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(productExceptSelf(a)));
    }
     public static int[] productExceptSelf(int[] a) 
     {
        int pro=1;
        int zeros=0;
        boolean exist=false;
        for(int p:a)
        {
            if(p!=0)
            {
                pro*=p;
            }
            if(p==0)
            {
                exist=true;
                zeros++;
            }
        }
         System.out.println(pro);
         
         for(int i=0;i<a.length;i++)
         {
             if(!exist)
             {
                if(a[i]!=0)
                {
                    a[i]=pro/a[i];
                }
                else
                {
                    a[i]=pro;
                }
             }
             else if(zeros==1) //zero exists 
             {
                 if(a[i]!=0)// if number is not zero then make it zero
                 {
                     a[i]=0;
                 }
                 else // if number is not zero make it pro2
                 {
                     a[i]=pro;
                 }
             }
             else
             {
                 a[i]=0;
             }
         }
         return a;
     }
}
