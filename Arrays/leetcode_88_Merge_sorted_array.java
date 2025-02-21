package Arrays;

import java.util.Arrays;

public class leetcode_88_Merge_sorted_array 
{
    public static void main(String[] args) {
        int a[]={1,2,3,0,0,0};
        int b[]={2,5,6};
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        //System.out.println(Arrays.toString(merge(a,0,b,1)));
        //System.out.println(Arrays.toString(a));
        merge(a, 3, b, 3);
        System.out.println("Result is "+Arrays.toString(a));
    }
    public static void merge(int[] a, int m, int[] b, int n)
    {
        int last=m+n-1;
        while(m>0 && n>0)
        {
            if(a[m-1]>b[n-1])
            {
                a[last]=a[m-1];
                m--;
            }
            else
            {
                a[last]=b[n-1];
                n--;
            }
            last--;
        }
        //if phele n<0 ho jaye toh a ke elements automatically placed hai 
        //par agar phele m<0 ho toh b ke leftover elements mannually copy karo
        while(n>0)
        {
            a[last]=b[n-1];
            n--;
            last--;
        }
    }
}
