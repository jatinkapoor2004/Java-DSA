package Recursion_Level_2;
//TLE ERROR BCOZ IT REQUIRE MEMORIZATION CONCEPT
public class Leetcode_70_count_ways_to_climb_stairs 
{
    public static void main(String[] args) {
        System.out.println(climbStairs(45));
    }
    public static int climbStairs(int n)
    {
        if(n<0)
            return 0;
        else if(n==0)
            return 1;
        else
        {
            return (climbStairs(n-1)+climbStairs(n-2));
            
        }
    }
}
