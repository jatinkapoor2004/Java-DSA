import java.math.*;
public class Big_Integer
{
    public static void main(String[] args)
    {
        BigInteger n=new BigInteger("100");
        BigInteger fact=new BigInteger("1");
        BigInteger i ;
        
        for(i=n ;i.compareTo(BigInteger.ONE)>=1;i=i.subtract(BigInteger.ONE))
                {
                    fact=fact.multiply(i);
                }
        System.out.println(fact);
    }   
    
}
