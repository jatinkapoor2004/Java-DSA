package Recursion_Level_2;
public class target_sum_exist_or_not 
{
    public static void main(String[] args) 
    {
        int a[]={1,2,3,7,8,10};
        System.out.println(exist_or_not(a, 5, 0));
    }
    static boolean exist_or_not(int a[],int target,int i)
    {
        if(i==a.length)
        {
            return target==0;
        }
        else
        {
            return (exist_or_not(a, target-a[i], i+1) || exist_or_not(a, target, i+1));
        }
    }
}
