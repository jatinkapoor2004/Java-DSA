package Strings;

import java.util.Stack;

public class leetcode_394_decode_String 
{
    public static void main(String[] args)
    {        
        System.out.println("3[a10[bc]]");
        System.out.println(decodeString("3[a10[bc]]"));
    }
    public static String decodeString(String str)
    {
        Stack<Integer> st=new Stack<>();
        Stack<String> st2=new Stack<>();
        int k=0;
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(Character.isDigit(ch))
            {
                k=k*10+ch-'0';
                System.out.println("k is "+k);
                
                System.out.println(k+" is pushed in stack 1 ");
                System.out.println("stack 1 "+ st);
            }
            else if(ch=='[')
            {
                st.push(k);
                k=0;
                st2.push(ch+"");
                System.out.println(ch+" is pushed in stack 2 ");
                
            }
            else if(Character.isLetter(ch))
            {
                st2.push(ch+"");
                System.out.println(ch+" is pushed in stack 2 ");

            }
            else if(ch==']')
            {
                String s="";
                System.out.println(st2.lastElement());
                while(!(st2.lastElement().equals("[")))
                {
                    System.out.println(st2.lastElement()+" is checked with "+']');
                    s=st2.pop()+s;
                    System.out.println(s+" is the current string to be added ");                    
                }
                System.out.println(s+" is string inside innermost brackets");
                st2.pop();
                System.out.println(st2);
                int n=st.pop();
                String p="";
                for(int j=1;j<=n;j++)
                {
                    p=p+s;
                }
                st2.add(p);
                System.out.println(p+" is pushed in stack 2");
            }
        }
        String s="";
        while(!st2.empty())
        {
            s=st2.pop()+s;
        }
        return s;
    }
}
