import java.util.*;
public class hm_testing
{
    public static void main(String[] args) {
        HashMap<Character,Integer>hm=new HashMap<>();
        hm.put('a', 1);
        hm.put('b', 2);
        hm.put('c', 3);
        hm.put('d', 4);
        System.out.println(hm.containsValue(4));
        
    }
}
