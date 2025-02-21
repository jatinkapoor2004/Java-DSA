package Strings;

import java.util.ArrayList;
import java.util.List;

public class leetcode_412_fizz_buzz 
{
    public static void main(String[] args) 
     {
         System.out.println(fizzBuzz(15));
    }
    public static List<String> fizzBuzz(int n) 
    {
        List<String> al=new ArrayList<>();
        for(int i=1;i<=n;i++)
        {
            if(i%3==0 && i%5!=0)
            {
                al.add("Fizz");
            }
            else if(i%5==0 && i%3!=0)
            {
                al.add("Buzz");
            }
            else if(i%5==0 && i%3==0)
            {
                al.add("FizzBuzz");
            }
            else
            {
                al.add(i+"");
            }
        }
        return al;
    }
}
