package Strings;
import java.util.*;
public class weight_of_each_word 
{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter string to get its weight");
        String s=scan.nextLine();
        weight(s);
    }
    static void weight(String s)
    {
       StringTokenizer st=new StringTokenizer(s);
       int count=st.countTokens();
       for(int i=0;i<count;i++)
       {
           String p=st.nextToken();
           int sum=0;
           for(int j=0;j<p.length();j++)
           {
               sum=sum+(p.charAt(j)-96);
           }
           System.out.println(sum);
       }
    }
}

