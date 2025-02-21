import java.util.*;
public class Two_Sum 
{
    public static void main(String[] args)
    {
        int a[]={3,2,4};
        System.out.println(Arrays.toString(twoSum(a,6)));
    }

    static int[] twoSum(int a[] ,int target)
    {
        int b[]=new int[2];
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i =0; i<a.length; i++)
        {
            hm.put(a[i],i);
        }
        for(int i=0;i<a.length;i++)
        {
            int diff=target-a[i];
            if (hm.containsKey(diff))
            {
                if(hm.get(diff)==i)
                {
                    //do nothing
                    continue;
                }
                
                b[0]=i;
                b[1]=hm.get(diff);
                break;
            }
        }
        return b;
        
    }
}
