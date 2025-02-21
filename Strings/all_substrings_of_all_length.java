package Strings;
public class all_substrings_of_all_length 
{
    public static void main(String[] args) 
    {
        extractall("jatin");
    }
    static void extractall(String s)
    {
        for(int k=1;k<=s.length();k++)
        {
            System.out.print("Substrings of "+k+ " size---->");
            substring_of_k_size.extract(s, k);
            System.out.println();
        }
    }
    
}
