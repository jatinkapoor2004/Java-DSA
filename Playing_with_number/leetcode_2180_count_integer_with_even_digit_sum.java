package Playing_with_number;
public class leetcode_2180_count_integer_with_even_digit_sum 
{
    public static void main(String[] args) {
        System.out.println(countEven(4));
    }
    public static int countEven(int n) 
    {
        int count=0;
        for(int i=2;i<=n;i++)
        {
            int sum=0;
            //System.out.println("i is "+i);
            int p=i;
            while(p!=0)
            {
                int dig=p%10;
                p=p/10;
                sum=sum+dig;
            }
            //System.out.println("sum is "+sum);
            if(sum%2==0)
                count++;
        }
        return count;
    }
}
