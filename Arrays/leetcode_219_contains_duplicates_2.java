package Arrays;
import java.util.HashMap;
public class leetcode_219_contains_duplicates_2 
{
    public static void main(String[] args) {
        int a[]={-1,-1};
        System.out.println(containsNearbyDuplicate(a, 2));
    }
    public static boolean containsNearbyDuplicate(int[] a, int k)
    {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<a.length;i++)
        {
            if(hm.containsKey(a[i]))
            {
                if(i-hm.get(a[i])<=k)
                {
                    return true;
                }
                else{
                    hm.put(a[i], i);
                }
            }
            else
            {
                hm.put(a[i], i);
            }
        }
        return false;
    }
}
