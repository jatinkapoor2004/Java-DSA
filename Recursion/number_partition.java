package Recursion;
public class number_partition 
{
    public static void main(String[] args)
    {
        int n =4; 
        num_partions(n,"");
    }
    static void num_partions(int n,String ans  )
    {
        if(n==0)
        {
            System.out.println(ans);
        }
        else
        {
            for(int i=1;i<=n;i++)
            num_partions(n-i, ans+i+" ");
        }
    }
}
