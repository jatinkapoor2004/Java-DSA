package Extra_Random_Questions;
import java.util.*;
public class alex_love_for_letters_nagarro 
{
    static ArrayList<String>al=new ArrayList<>();
    public static void main(String[] args) {
        String s1="zyxwvutsrqponmlkjihgfedcba";
        String s2="ehkx";
        int k=2;
        int n=4;
        HashMap<Character,Integer> hm=new HashMap<>();
        for(int i=0;i<s1.length();i++)
        {
            hm.put(s1.charAt(i), i);
        }
        System.out.println(hm);
        smallest_lexographically(hm, s2,0, 4, 2, "");
        System.out.println(al);
        Collections.sort(al);
        System.out.println(al.get(0));
    }
    static void smallest_lexographically(HashMap<Character,Integer> hm,String s2,int i,int n,int k,String ans)
    {
        if(i==n-1 || ans.length()==k)
        {
//            if(ans.length()==k)
//            {
//                boolean check_order=true;
//                for(int j=0;j<k-1;j++)
//                {
//                    if(hm.get(ans.charAt(j)) )
//                    {
//                        check_order=false;
//                        break;
//                    }
//                }
//                if(check_order)
//                {
                    al.add(ans);
                //}
//            }
        }
        
        else
        {
            //include
            smallest_lexographically(hm, s2, i+1,n, k+1, ans+s2.charAt(i));
            //dont include
            smallest_lexographically(hm, s2, i+1,n, k, ans);
        }
    }
}
