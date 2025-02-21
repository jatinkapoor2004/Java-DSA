package Playing_with_number;
public class Leetcode_50_power_of_x_n 
{
    public static void main(String[] args) {
        System.out.println(myPow( 0.00001, 2147483647));
    }
    public static double myPow(double x, int n) 
    {
        int p=n;
        if(n<0)
        {
            n = - n;
            //System.out.println(n);
        }
        if(p<0)
            return 1/mine(x, n);
        else
            return mine(x, n);
    }
    static double mine(double x,int n)
    {
        if(n==0)
        {
            return 1;
        }
        if(x==0)
        {
            return 0;
        }
        else
        {
            double ans=mine(x, n/2);
            if(n%2==0)
                return ans * ans;
            else
                return ans *ans *x;
        }
    }
}
