package Recursion_Level_2;
public class number_partition 
{
    public static void main(String[] args) {
        no_partition(3,"");
    }
    static void no_partition(int n,String ans)
    {
        if(n==0)
        {
            System.out.println(ans);
        }
        else
        {
            for(int j=n;j>=1;j--)
            {
                no_partition(n-j, ans+j);
            }
        }
    }
}
