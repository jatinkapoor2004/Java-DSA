package Recursion;
public class no_of_combinations_NCR 
{
    public static void main(String[] args) 
    {
        System.out.println(combinations(4, 2));
    }
    static int combinations(int n,int r)
    {
        if(n==r || r==0)
        {
            return 1;
        }
        else
        {
            return combinations(n-1, r)+combinations(n-1, r-1);
        }
    }
}
