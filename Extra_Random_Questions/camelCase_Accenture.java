//you are given a camelcase string and covert string to different
//words and printl them in different line

//example input is goInIndiaCome 
//output  GO
//        iN
//        iNDIA
//         cOME
package Extra_Random_Questions;
import java.util.*;
public class camelCase_Accenture 
{
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("enter string ");
        String s=scan.nextLine();
        mine(s);
    }
    static void mine(String s)
    {
        String p="";
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(Character.isLowerCase(ch))
            {
                ch=Character.toUpperCase(ch);
                p += ch;
            }
            else
            {
                System.out.println(p);
                p="";
                ch=Character.toLowerCase(ch);
                p += ch;
            }
        }
        System.out.println(p);
    }
}
