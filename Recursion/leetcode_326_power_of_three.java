package Recursion;
public class leetcode_326_power_of_three 
{
    public static void main(String[] args) {
        System.out.println(isPowerOfThree(45));
    }
     public static boolean isPowerOfThree(int n) 
    {
        if(n==0)
        {
            return false;
        }
        if(n==1)
        {
            return true;
        }
        else
        {             
            System.out.println("called for "+n +" and "+n/3);
            return isPowerOfThree(n/3) && n%3==0;
        }
    }
}
