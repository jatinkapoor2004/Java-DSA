package Playing_with_number;

import java.util.Arrays;

public class leetcode_204_count_primes_Sieve_of_Eratosthenes 
{
    public static void main(String[] args) {
        System.out.println(countPrimes(10));
    }
     public static int countPrimes(int n)
    {
        if(n==1 || n==0)
        return 0;
        
        n=n-1;
        int a[]=new int[n+1];
        for(int i=0;i<a.length;i++)
        {
            a[i]=i;
        }
        System.out.println(Arrays.toString(a));
        
        for(int i=2;i<=Math.sqrt(n);i++)
        {
            System.out.println(a[i]+" is the number whose multiples are going to be deleted");
            if(a[i]!=0)
            {
                System.out.println("multiple of "+a[i]+ " are not already cut");
                for(int j=i;j<=n/i;j++)
                {
                    //if(a[j]!=0)
                    System.out.println("we make "+a[i*j]+" =0");
                    a[i*j]=0;
                }
            }
        }
        System.out.println(Arrays.toString(a));
        int count=0;
        for(int i=2;i<=n;i++)
        {
            if(a[i]!=0)
                count++;
        }
        return count;
    }
}
