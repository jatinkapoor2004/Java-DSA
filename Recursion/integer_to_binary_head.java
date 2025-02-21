package Recursion;
public class integer_to_binary_head 
{
    public static void main(String[] args) {
        System.out.println(convert(19));
    }
    static String convert(int n)
    {
        if(n==0)
            return "";
        else
        {
            int rem=n%2;
            n=n/2;
            return convert(n)+rem;
        }
        
    }
}
