package Strings;
public class frequency_of_each_character_without_extra_DS 
{
    public static void main(String[] args) {
        String s="hello world how are you";
        frequency(s);
    }
    static void frequency(String s)
    {
        for(int i=0;i<s.length();i++)
        {
            int count=0;
            boolean found=false;
            for(int j=i-1;j>=0;j--)
            {
                if(s.charAt(j)==s.charAt(i))
                {
                    found=true;
                   // System.out.println(s.charAt(i)+" is already counted");
                    break;
                }
            }
            if(!found)
            {
                for(int k=i;k<s.length();k++)
                {
                    if(s.charAt(i)==s.charAt(k))
                    {
                        count++;
                    }
                }
                System.out.println(s.charAt(i)+" ---> "+count);
            }
        }
    }
}
