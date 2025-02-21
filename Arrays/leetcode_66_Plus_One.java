package Arrays;

import java.util.Arrays;

public class leetcode_66_Plus_One {
    public static void main(String[] args) {
        int a[]={9,8,7,6,5,4,3,2,1,0};
        System.out.println(Arrays.toString(plusOne(a)));
    }
    public static int[] plusOne(int[] a)
    {
        long num=0;
        for(int i=0;i<a.length;i++)
        {
            num=(num*10);
            num+=a[i];            
        }       
        num++;     
        System.out.println(num);
        long p=num;
        int leng=0;
        while(num!=0)
        {
            num=num/10;
            leng++;
        }
        System.out.println("length is" +leng);
        int b[]=new int[leng];
        while(p!=0)
        {
            b[leng-1]=(int)p%10;
            System.out.println("Number added");
            System.out.println((int)p%10);
            p=p/10;
            leng--;
        }
        return b;
    }
}
