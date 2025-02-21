package Recursion_Level_2;

import java.util.StringTokenizer;

public class max_product 
{
    public static void main(String[] args) {
        int a[]={1};
        max_prod(8, "",a);
        System.out.println(a[0]);
    }
    static void max_prod(int n,String ans,int a[])
    {
        if(n==0)
        {
            System.out.print(ans);
            StringTokenizer st=new StringTokenizer(ans);
            int count=st.countTokens();
            int pro=1;
            for(int k=0;k<count;k++)
            {
                int p=Integer.parseInt(st.nextToken());
                pro=pro*p;
            }
            System.out.println(" ---> "+pro);
            a[0]=Math.max(a[0], pro);
        }
        else
        {
            for(int j=n;j>=1;j--)
            {
                max_prod(n-j, ans+j+" ", a);
            }
        }
    }
}
