package Recursion;
public class nth_term_in_fibonacci 
{
    public static void main(String[] args) {
        System.out.println(fibonacci(5));   
    }
    static int fibonacci(int n)
    {
        if(n==1)
            return 0;
        else if(n==2)
            return 1;
        else
            return fibonacci(n-1)+fibonacci(n-2);
    }
}
