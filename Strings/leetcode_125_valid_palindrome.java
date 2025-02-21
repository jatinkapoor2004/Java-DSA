package Strings;
public class leetcode_125_valid_palindrome 
{
    public static void main(String[] args)
    {
        System.out.println(isPalindrome( "0P"));
    }
    public static boolean isPalindrome(String s) 
    {
        s=s.toLowerCase();
        String s2="";
        for(int i=0;i<s.length();i++)
        {
            if((s.charAt(i)>='a' && s.charAt(i)<='z') || (s.charAt(i)>='0' && s.charAt(i)<='9'))
            {             
                s2=s2+s.charAt(i);
            }
        }     
        System.out.println(s2);
        for(int i=0;i<s2.length()/2;i++)
       {
        if(s2.charAt(i)!=s2.charAt(s2.length()-1-i))
        return false;
       }
       return true;
    }
}
