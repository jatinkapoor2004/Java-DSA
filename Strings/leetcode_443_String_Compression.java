package Strings;
public class leetcode_443_String_Compression 
{
    public static void main(String[] args)
    {
        char ch[]={'a', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b'};
        System.out.println(compress(ch));
    }
    public static int compress(char[] a) 
    {
        StringBuilder sb=new StringBuilder("");
        int left=0,right=0;
        while(right<a.length)
        {
            char ch= a[right];
            sb.append(ch);
            int count=0;
            while(a[left]==ch  )
            {
                count++;
                left++;
                right++;
                if(left==a.length)
                    break;
                //System.out.println(s);
            }
            if(count>1)
            sb.append(count);
            //System.out.println(s);
        }
        //System.out.println(s);
        for(int i=0;i<sb.length();i++)
        {
            a[i]=sb.charAt(i);
        }
        return sb.length();
    }
}
