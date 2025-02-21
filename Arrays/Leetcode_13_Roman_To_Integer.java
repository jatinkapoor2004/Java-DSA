package Arrays;
import java.util.*;
public class Leetcode_13_Roman_To_Integer 
{
    public static void main(String[] args) {
        System.out.println(romanToInt("MCMXCIV"));
    }
    public static int romanToInt(String s) {
        int val=0;
        HashMap<Character,Integer> hm=new HashMap<>();
        hm.put('I', 1);
        hm.put('V', 5);
        hm.put('X', 10);
        hm.put('L', 50);
        hm.put('C', 100);
        hm.put('D', 500);
        hm.put('M', 1000);
        for(int i=0;i<s.length()-1;i++)
        {
            if(hm.get(s.charAt(i))<hm.get(s.charAt(i+1)))
            {
                //System.out.println("hits");
                val=val-hm.get(s.charAt(i));
                //System.out.println("val");
            }
            else
            {
                val=val+hm.get(s.charAt(i));
            }
        }
        return val+hm.get(s.charAt(s.length()-1));
    }
}
