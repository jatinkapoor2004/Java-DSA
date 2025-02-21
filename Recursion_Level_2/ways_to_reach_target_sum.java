package Recursion_Level_2;
public class ways_to_reach_target_sum 
{
    public static void main(String[] args) {
    int a[]={1,2,3,7,8,10};
        ways_to_target(a, 10, 0, 0, "");
    }
    static void ways_to_target(int a[],int target,int i,int sum,String ans)
    {
        if(i==a.length)
        {
            if(sum==target)
                System.out.println(ans);
        }
        else if(sum>target){}
        else
        {
 //           sum=sum+a[i];
            ways_to_target(a, target, i+1, sum+a[i], ans+a[i]+" ");
            ways_to_target(a, target, i+1, sum, ans);
        
        }
    }
}
