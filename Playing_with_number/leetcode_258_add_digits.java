package Playing_with_number;
public class leetcode_258_add_digits 
{
    public static void main(String[] args) {
        System.out.println(addDigits(38));
    }
    public static int addDigits(int n) 
    {
        while(n!=0)
        {
            n=sum(n);
            if(n/10==0)
            {
                return n;                
            }
            
        }
        return 0;
    }
    public static int sum(int n)
    {
        int val=0;
        while(n!=0)
        {
            int rem=n%10;
            val=val+rem;
            n=n/10;
        }
        return val;
    }
}
