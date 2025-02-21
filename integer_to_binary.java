public class integer_to_binary 
{
    public static void main(String[] args)
    {
        System.out.println(inttobin(15));
    }
    static String inttobin(int n)
    {
        String s="";
        while(n!=0)
        {
            int rem=n%2;
            s=rem+s;
            n=n/2;
        }
        return s;
    }
}
