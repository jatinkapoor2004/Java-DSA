package Recursion;
public class digit_count_head_solution 
{
    public static void main(String[] args) {
        System.out.println(cover_corner_case_if_equals_0(5));
    }
    static int cover_corner_case_if_equals_0(int n)
    {
        if(n==0)
            return 1;
        else 
            return digitcount(n);
    }
    static int digitcount(int n)
    {
        if(n==0)
            return 0;
        else
        {            
            return (1+ digitcount(n/10));
        }
    }
}
