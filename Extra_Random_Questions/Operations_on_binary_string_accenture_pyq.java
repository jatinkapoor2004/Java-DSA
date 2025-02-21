package Extra_Random_Questions;
import java.util.Scanner;
import java.util.Stack;
public class Operations_on_binary_string_accenture_pyq 
{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter string");
        String s = scan.nextLine();
        System.out.println(mine(s));
    }
    public static int mine(String s)
    {
        int res=s.charAt(0) - '0';
        for(int i=1;i<s.length();)
        {
            char operation = s.charAt(i);
            i++;
            if(operation == 'A')
            {
                res = res & (s.charAt(i) - '0');
            }
            else if (operation == 'B')
            {
                res = res | (s.charAt(i) - '0');
            }
            else
            {
                res =res ^ (s.charAt(i) - '0');
            }
            i++;
        }
        return res;
    }
    
}
