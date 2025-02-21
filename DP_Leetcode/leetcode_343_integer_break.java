package DP_Leetcode;
public class leetcode_343_integer_break 
{
    public static void main(String[] args) 
    {
        System.out.println(integerBreak(10));
    }
    public static int integerBreak(int num)
    {
        int a[]=new int [num];
        for(int i=0;i<a.length;i++)
        {
            a[i]=i;
        }
        int n=a.length;
        return mine(num, a,n);
    }
    public static int mine(int num,int a[],int n)
    {
        if(num==1 || n==0)
        {
            return 1;            
        }
        else
        {
            int ans1=1,ans2=1,index=n-1;
            if(num-a[index]>=1)
            {
                ans1=ans1*mine(num-a[index],a, index);
            }
            ans2=ans2* mine(num, a,index+1);
            return Math.max(ans1, ans2);
        }
    }
}
