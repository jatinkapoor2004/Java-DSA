package Recursion_Level_2;
public class count_of_ways_to_reach_target_head_solution 
{
    public static void main(String[] args) {
        int a[]={1,2,3,7,8,10};
        System.out.println(count_ways_tail(a, 10, 0));
    }
    static int count_ways_tail(int a[],int target,int i)
    {
        if(i==a.length)
        {
            if(target==0)
                return 1;
            else
                return 0;
        }
        else
        {
            int ans1=count_ways_tail(a, target-a[i], i+1);
            int ans2=count_ways_tail(a, target, i+1);
            return ans1+ans2;
        }
    }
}
