package Strings;
public class leetcode_43_Multiply_strings 
{
    public static void main(String[] args) {
        System.out.println(multiply("696", "6516"));
    }
    public static String multiply(String num1, String num2)
    {
        java.math.BigInteger bi1=new java.math.BigInteger(num1);
        java.math.BigInteger bi2=new java.math.BigInteger(num2);
        java.math.BigInteger bi3=new java.math.BigInteger("1");
        bi3=bi1.multiply(bi2);
        return ""+bi3;
    }
}
