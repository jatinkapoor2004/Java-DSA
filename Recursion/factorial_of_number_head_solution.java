package Recursion;
public class factorial_of_number_head_solution 
{
    public static void main(String[] args) {
        System.out.println(factorial(1));
    }
    static int factorial(int n)
    {
        if(n==1)
            return 1;
        else 
        {
            return n*factorial(n-1);
        }
    }
    
}
