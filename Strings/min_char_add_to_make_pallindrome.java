package Strings;
public class min_char_add_to_make_pallindrome 
{
    public static void main(String[] args) {
        System.out.println(charforpallindrome("jatin")); 
    }
    static int charforpallindrome(String s)
    {
        for(int i=0;i<s.length();i++)
        {
            StringBuffer sb=new StringBuffer(s.substring(0,i)).reverse();
            System.out.println("substring that is added to string "+sb);
            System.out.println(s+sb.toString());
            if(pallindrome(s+sb.toString()))
            {
                return i;
            }
        }
        return 0;
    }
    static boolean pallindrome(String s)
    {
        return new StringBuffer(s).reverse().toString().equals(s);
    }
}
