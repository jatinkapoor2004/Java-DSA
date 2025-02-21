package Strings;
public class leetcode_345_reverse_vowels_of_a_string 
{
    public static void main(String[] args) {
        System.out.println(reverseVowels("leetcode"));
    }
    public static String reverseVowels(String s) 
    {
        StringBuilder sb=new StringBuilder("");
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch=='a' ||ch=='e' ||ch=='i' ||ch=='o' ||ch=='u' ||ch=='A' ||ch=='E' ||ch=='I' ||ch=='O' ||ch=='U')
            {
                sb.append(ch);
            }
        }
        String rev=sb.reverse().toString();
        //System.out.println("rev is "+rev);
        int j=0;
        sb.delete(0, sb.length());
        //System.out.println("new sb is "+sb);
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch=='a' ||ch=='e' ||ch=='i' ||ch=='o' ||ch=='u' ||ch=='A' ||ch=='E' ||ch=='I' ||ch=='O' ||ch=='U')
            {
                sb.append(rev.charAt(j));
                j++;
            }
            else
            {
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}
