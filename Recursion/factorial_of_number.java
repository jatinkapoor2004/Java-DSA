package Recursion;
public class factorial_of_number 
{
    public static void main(String[] args) {
        factorial(5,1);
    }
    static void factorial(int n,int ans)
    {
        if(n==1)
        {
            System.out.println(ans);
        }
        else
        {
            factorial(n-1, ans*n);
        }
    }
}
