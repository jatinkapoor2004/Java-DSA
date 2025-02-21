package Strings;
public class substring_of_k_size 
{
    public static void main(String[] args) {
        extract("jatin", 4);
    }
    static void extract(String s,int k)
    {
        for(int i=0;i<=s.length()-k;i++)
        {
            System.out.print(s.substring(i,i+k)+" : ");
        }
    }
}


