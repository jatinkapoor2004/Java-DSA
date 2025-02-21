package Recursion_Level_2;
public class count_of_ways_to_reach_target_tail_solution 
{
    public static void main(String[] args) {
        int a[]={1,2,3,7,8,10};
        int b[]={0};
        count_ways(a, 10, 0, b);
        System.out.println(b[0]);
    }
    static void count_ways(int a[],int target,int i,int b[])
    {
        if(i==a.length)
        {
            if(target==0)
            {
                b[0]++;
            }
        }
        else
        {
            count_ways(a, target-a[i], i+1, b);
            count_ways(a, target, i+1, b);
        }
    }
}
