package Playing_with_number;

import java.util.HashSet;

public class leetcode_202_happy_number 
{
    public static void main(String[] args) {
        System.out.println(isHappy(2));
    }
    public static boolean isHappy(int n) 
    {
        HashSet <Integer> hs=new HashSet<>();
        int sum=0;
        while(true)
        {
            while(n!=0)
            {
                int digit=n%10;
                System.out.println("digit is "+digit);
                n=n/10;
                sum=sum+(digit*digit);
            }
            if(!hs.add(sum))
                return false;
            System.out.println("sum is "+sum);
            if(sum==1)
            return true;
            
            else
            {
                n=sum;
                sum=0;
            }
        }
    }
}
