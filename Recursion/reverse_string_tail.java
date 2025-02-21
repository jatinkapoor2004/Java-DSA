package Recursion;
public class reverse_string_tail 
{
    public static void main(String[] args) {
        reverse("jatin","",0);
    }
    static void reverse(String s,String ans,int i)
    {
       if(i==s.length())
            System.out.println(ans);
       else
       {
           char ch=s.charAt(i);
           reverse(s, ch+ans, ++i);
       }
    }
}