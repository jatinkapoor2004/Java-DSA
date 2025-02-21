package Strings;
import java.util.*;
public class String_to_keypad_number 
{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter string to be converted into Numbers");
        String s=scan.nextLine();
        keypad(s);
    }
    static void keypad(String s)
    {
        HashMap<Character,Integer> hm=new HashMap<>();
        hm.put('a', 2);
        hm.put('b', 2);
        hm.put('c', 2);
        hm.put('d', 3);
        hm.put('e', 3);
        hm.put('f', 3);
        hm.put('g', 4);
        hm.put('h', 4);
        hm.put('i', 4);
        hm.put('j', 5);
        hm.put('k',5);
        hm.put('l',5);
        hm.put('m', 6);
        hm.put('n', 6);
        hm.put('o', 6);
        hm.put('p', 7);
        hm.put('q', 7);
        hm.put('r', 7);
        hm.put('s', 7);
        hm.put('t', 8);
        hm.put('u', 8);
        hm.put('v', 8);
        hm.put('w', 9);
        hm.put('x', 9);
        hm.put('y', 9);
        hm.put('z', 9);
        hm.put(' ',0);
        for(int i=0;i<s.length();i++)
        {
            System.out.print(hm.get(s.charAt(i)));
        }
        
    }
}
