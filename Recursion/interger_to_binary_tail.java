package Recursion;
public class interger_to_binary_tail 
{
    public static void main(String[] args) {
        convert(16,"");
    }
    static void convert(int n,String ans)
    {
        if(n==0)
            System.out.println(ans);
        else
        {
            int rem=n%2;
            n=n/2;
            convert(n, rem+ans);
        }
    }
}
