package Strings;
public class leetcode_1945_sum_of_digit_of_string 
{
    public static void main(String[] args) {
        //System.out.println(sum("45"));
        System.out.println(getLucky("iiiii", 1));
    }
    public static int getLucky(String s, int k) 
    {
        String p="";
        for(int i=0;i<s.length();i++)
        {
            p=p+( s.charAt(i)-'a'+1);
        }
        int sum1=0;
        for(int i=1;i<=k;i++)
        {
            sum1=sum(p);
            p=sum1+"";
        }
        
        return sum1;
    }
    
    public static int sum(String s)
    {
        int val=0;
        int p=0;
        while(p<s.length())
        {
            char ch=s.charAt(p);
            //System.out.println(p);
            int n=Integer.parseInt(ch+"");
            //System.out.println(n);
            val=val+n;
            p++;
        }
        return val;
    }
}
