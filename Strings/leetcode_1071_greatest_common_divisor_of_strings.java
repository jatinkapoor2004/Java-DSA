package Strings;
public class leetcode_1071_greatest_common_divisor_of_strings 
{
    public static void main(String[] args)
    {
        String s1="ABC";
        String s2="ABCABC";
        System.out.println(gcdOfStrings(s1, s2));
    }
    public static String gcdOfStrings(String s1, String s2) 
    {
        int len1=s1.length();
        int len2=s2.length();
        int small=Math.min(len1, len2);
        int big=Math.max(len1, len2);
        System.out.println(small+"  "+big);
        
        int len=0;
        for(int i=small;i>=0;i--)
        {
            if(small %i==0 && big%i==0)
            {
                len=i;
                break;
            }
        }
        String p=s1.substring(0,len);
        
        System.out.println("substring is "+p);
        String yo="";
        String comm=s1+s2;
        System.out.println("comm is "+comm);
        for(int i=1;i<=(small+big)/len;i++)
        {
            yo=yo+p;
        }
        System.out.println("yo is "+yo);
        if(yo.equals(comm))
            return p;
        return "";
    }
}
