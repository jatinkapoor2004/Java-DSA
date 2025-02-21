package Strings;

import java.util.Stack;

public class leetcode_20_valid_parenthesis 
{
    public static void main(String[] args) 
    {
        System.out.println(isValid("{]"));
    }
    public static boolean isValid(String s) 
    {
        Stack<Character> st=new Stack<>();
        st.push(s.charAt(0));
        for(int i=1;i<s.length();i++)
        {
            char ch=s.charAt(i);
            //System.out.println(ch+ " is the character");
            if(st.isEmpty())
            {
                st.push(ch);
            }
            //System.out.println(st.lastElement()+" is the last element");

            else if(ch=='}' && st.lastElement()=='{')
            {                
                st.pop();
                //System.out.println("stack is "+st);
            }
            else if(ch==']' && st.lastElement()=='[')
            {                
                st.pop();
                //System.out.println("stack is "+st);

            }
            else if(ch==')' && st.lastElement()=='(')
            {                
                st.pop();
               // System.out.println("stack is "+st);

            }
            else
            {
                st.push(ch);
                //System.out.println(ch+" is pushed");
            }
        }
        return (st.isEmpty());
    }
}
