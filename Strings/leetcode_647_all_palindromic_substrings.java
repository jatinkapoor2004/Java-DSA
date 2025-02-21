package Strings;
public class leetcode_647_all_palindromic_substrings 
{
    public static void main(String[] args) 
    {
        System.out.println(countSubstrings("aaa"));
    }
    public static int countSubstrings(String s)
    {
        int count=0;
        for(int i=1;i<=s.length();i++)
        {
            for(int j=0;j<=s.length()-i;j++)
            {
                if(palindrome(s.substring(j,j+i)))
                {
                    count++;
                }
            }
        }
        return count;
    }
    public static boolean palindrome(String s)
    {
        return new StringBuffer(s).reverse().toString().equals(s);
    }
}
