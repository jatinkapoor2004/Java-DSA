package Strings;
import java.util.HashSet;
public class make_String_pangram 
{
    public static void main(String[] args) {
        String s="jatin";
        makepangram(s);
    }
    public static void makepangram(String s)
    {
        HashSet<Character> hs=new HashSet<>();
        for(int i=0;i<s.length();i++)
        {
            if(Character.isLetter(s.charAt(i)))
            {
                hs.add(s.charAt(i));
            }
        }
        for(char i='a';i<'z';i++)
        {
            if(!(hs.contains(i)))
            {
                System.out.println(i);
            }
        }
    }
}
