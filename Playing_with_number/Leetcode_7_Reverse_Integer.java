package Playing_with_number;
public class Leetcode_7_Reverse_Integer 
{
    public static void main(String[] args) {
        System.out.println(reverse(-2147483648));
    }
    public static int reverse(int x) 
    {
        int p=x;
        if(x<0)
        {
            x=-x;
        }
        System.out.println(x+ " --->  postive ");
        StringBuffer sb=new StringBuffer(""+x);
        String s=sb.reverse().toString();
        if(x<0)
        {
            s=s.substring(0,s.length()-1);
        }
        System.out.println(s);        
        long l= Long.parseLong(s);
        System.out.println(l);
        if(l>Integer.MAX_VALUE)
            return 0;
        int n=Integer.parseInt(s);
        //System.out.println(n);
        if(p<0)
        {
            return n-(n+n);
        }
        return n;
    }
}
