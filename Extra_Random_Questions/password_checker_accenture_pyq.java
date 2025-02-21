package Extra_Random_Questions;
import java.util.*;
public class password_checker_accenture_pyq 
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter string ");
        String s=sc.nextLine();
        System.out.println("enter n");
        int n=sc.nextInt();
        System.out.println(mine(s,n));
    }
    public static int mine (String s, int n)
    {
        if(n<4)
            return 0;
        if(Character.isDigit(s.charAt(0)))
            return 0;
        int numeric=0 , capitals=0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch == ' ' || ch == '/')
                return 0;
            else if(Character.isUpperCase(ch))
                capitals++;
            else if(Character.isDigit(ch))
                numeric++;
        }
        if(numeric > 0  && capitals>0)
            return 1;
        else 
            return 0;
    }
}
