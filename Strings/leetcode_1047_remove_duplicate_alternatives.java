package Strings;
public class leetcode_1047_remove_duplicate_alternatives 
{
    public static void main(String[] args) {
        System.out.println(removeDuplicates("aaaaaaaaa"));
    }
    public static String removeDuplicates(String s) 
    {
        //System.out.println(s);
        StringBuilder sb=new StringBuilder(s);
        
        for(int i=0;i<sb.length()-1;i++)
        {
            if(sb.length()==1)
                return sb.toString();
            if(i<0)
                i=0;
            System.out.println(i+" outer loop");
            System.out.println("loop runs");
            if(sb.charAt(i)==sb.charAt(i+1))
            {
                System.out.println(sb);                
                sb.delete(i,i+2);
                System.out.println("deleted index are "+i+" and "+ (i+1));
                i=i-2;
                System.out.println(sb);
                System.out.println("new index to start is "+i);
            }
        }
        return sb.toString();
    }
}
