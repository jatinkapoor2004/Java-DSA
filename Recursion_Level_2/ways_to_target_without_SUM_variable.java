package Recursion_Level_2;
public class ways_to_target_without_SUM_variable 
{
    public static void main(String[] args) {
        int a[]={1,2,3,7,8,10};
        ways_to_target_without_sum(a, 10, 0, "");
    }
    static void ways_to_target_without_sum(int a[],int target,int i,String ans)
    {
        if(i==a.length)
        {
            if(target==0)
                System.out.println(ans);
        }
        else
        {
            ways_to_target_without_sum(a, target-a[i], i+1, ans+a[i]+" ");
            ways_to_target_without_sum(a, target, i+1, ans);
        }
    }
}
